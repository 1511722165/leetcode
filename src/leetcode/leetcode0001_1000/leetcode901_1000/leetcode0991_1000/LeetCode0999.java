package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0991_1000;

public class LeetCode0999 {

    public int numRookCaptures(char[][] board) {
        int res = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {

                    for (int a = i-1; a >= 0; a--) {
                        if (board[a][j] == 'B') {
                            break;
                        } else if (board[a][j] == 'p') {
                            res += 1;
                            break;
                        }
                    }
                    for (int b = i+1; b < 8; b++) {
                        if (board[b][j] == 'B') {
                            break;
                        } else if (board[b][j] == 'p') {
                            res += 1;
                            break;
                        }
                    }
                    for (int c = j-1; c >= 0; c--) {
                        if (board[i][c] == 'B') {
                            break;
                        } else if (board[i][c] == 'p') {
                            res += 1;
                            break;
                        }
                    }
                    for (int d = j+1; d < 8; d++) {
                        if (board[i][d] == 'B') {
                            break;
                        } else if (board[i][d] == 'p') {
                            res += 1;
                            break;
                        }
                    }
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode0999 demo =new LeetCode0999();
//        demo.numRookCaptures(new char[][]);
    }
}
