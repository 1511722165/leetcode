package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1721_1730;

import java.util.*;

public class LeetCode1728 {

    private static final int[][] DIRS = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // 左右上下

    public boolean canMouseWin(String[] grid, int catJump, int mouseJump) {
        int m = grid.length, n = grid[0].length();
        // 鼠和猫分别建图
        List<Integer>[] gMouse = new ArrayList[m * n];
        List<Integer>[] gCat = new ArrayList[m * n];
        Arrays.setAll(gMouse, i -> new ArrayList<>());
        Arrays.setAll(gCat, i -> new ArrayList<>());
        int mx = 0, my = 0, cx = 0, cy = 0, fx = 0, fy = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if (c == '#') { // 墙
                    continue;
                }
                if (c == 'M') { // 鼠的位置
                    mx = i; my = j;
                } else if (c == 'C') { // 猫的位置
                    cx = i; cy = j;
                } else if (c == 'F') { // 食物（洞）的位置
                    fx = i; fy = j;
                }
                int v = i * n + j; // 二维坐标 (i,j) 映射为一维坐标 v
                for (int[] dir : DIRS) { // 枚举左右上下四个方向
                    for (int k = 0; k <= mouseJump; k++) { // 枚举跳跃长度
                        int x = i + k * dir[0], y = j + k * dir[1];
                        if (x < 0 || x >= m || y < 0 || y >= n || grid[x].charAt(y) == '#') { // 出界或者遇到墙
                            break;
                        }
                        gMouse[v].add(x * n + y); // 连边
                    }
                    for (int k = 0; k <= catJump; k++) { // 枚举跳跃长度
                        int x = i + k * dir[0], y = j + k * dir[1];
                        if (x < 0 || x >= m || y < 0 || y >= n || grid[x].charAt(y) == '#') { // 出界或者遇到墙
                            break;
                        }
                        gCat[v].add(x * n + y); // 连边
                    }
                }
            }
        }

        // 判断是否鼠赢
        return catMouseGame(gMouse, gCat, mx * n + my, cx * n + cy, fx * n + fy) == 1;
    }

    // 913. 猫和老鼠
    private int catMouseGame(List<Integer>[] gMouse, List<Integer>[] gCat, int mouseStart, int catStart, int hole) {
        int n = gMouse.length;
        int[][][] deg = new int[n][n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                deg[i][j][0] = gMouse[i].size();
                deg[i][j][1] = gCat[j].size();
            }
        }

        int[][][] winner = new int[n][n][2];
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            winner[hole][i][1] = 1; // 鼠到达洞中（此时轮到猫移动），鼠获胜
            winner[i][hole][0] = 2;  // 猫到达洞中（此时轮到鼠移动），猫获胜
            winner[i][i][0] = winner[i][i][1] = 2; // 猫和鼠出现在同一个节点，无论轮到谁移动，都是猫获胜
            q.offer(new int[]{hole, i, 1});
            q.offer(new int[]{i, hole, 0});
            q.offer(new int[]{i, i, 0});
            q.offer(new int[]{i, i, 1});
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int mouse = cur[0], cat = cur[1], turn = cur[2];
            int win = winner[mouse][cat][turn]; // 最终谁赢了
            for (int[] pre : getPreStates(mouse, cat, turn, gMouse, gCat, winner)) {
                int preMouse = pre[0], preCat = pre[1], preTurn = turn ^ 1;
                // 情况一：如果上一回合鼠从 pre 移动到 cur，最终鼠赢，那么标记 pre 状态的 winner = 鼠
                // 情况二：如果上一回合猫从 pre 移动到 cur，最终猫赢，那么标记 pre 状态的 winner = 猫
                // 情况三：如果上一回合鼠从 pre 移动到 cur，最终猫赢，那么待定，直到我们发现从 pre 出发能到达的状态都是猫赢，那么标记 pre 状态的 winner = 猫
                // 情况四：如果上一回合猫从 pre 移动到 cur，最终鼠赢，那么待定，直到我们发现从 pre 出发能到达的状态都是鼠赢，那么标记 pre 状态的 winner = 鼠
                if (preTurn == win - 1 || --deg[preMouse][preCat][preTurn] == 0) {
                    winner[preMouse][preCat][preTurn] = win;
                    q.offer(new int[]{preMouse, preCat, preTurn}); // 继续倒推
                }
            }
        }

        // 鼠在节点 mouseStart，猫在节点 catStart，当前轮到鼠移动
        return winner[mouseStart][catStart][0]; // 返回最终谁赢了（或者平局）
    }

    // 获取 (mouse, cat, turn) 的上个状态（值尚未确定）
    private List<int[]> getPreStates(int mouse, int cat, int turn, List<Integer>[] gMouse, List<Integer>[] gCat, int[][][] winner) {
        List<int[]> preStates = new ArrayList<>();
        if (turn == 0) { // 当前轮到鼠移动
            for (int preCat : gCat[cat]) { // 上一轮猫的位置
                if (winner[mouse][preCat][1] == 0) { // 猫无法移动到洞中
                    preStates.add(new int[]{mouse, preCat});
                }
            }
        } else { // 当前轮到猫移动
            for (int preMouse : gMouse[mouse]) { // 上一轮鼠的位置
                if (winner[preMouse][cat][0] == 0) {
                    preStates.add(new int[]{preMouse, cat});
                }
            }
        }
        return preStates;
    }

    public static void main(String[] args) {
        LeetCode1728 game = new LeetCode1728();
        String[] grid = {
                "M.C...F"
        };
        System.out.println(game.canMouseWin(grid, 1, 3)); // Expected output: false (because the cat can catch the mouse)
    }
}
