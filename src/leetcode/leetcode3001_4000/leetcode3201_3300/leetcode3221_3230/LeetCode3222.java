package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3221_3230;

public class LeetCode3222 {

    public String losingPlayer1(int x, int y) {
        Boolean flag=true;
        while (x>=0&&y>=0){
            flag=!flag;
            x-=1;
            y-=4;
        }
        return flag?"Alice":"Bob";

    }

    public String losingPlayer(int x, int y) {
        return Math.min(x, y/4) % 2 == 1 ? "Alice" : "Bob";

    }
}
