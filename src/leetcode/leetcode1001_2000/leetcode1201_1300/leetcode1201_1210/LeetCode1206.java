package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1201_1210;

public class LeetCode1206 {

    int count[];
    public LeetCode1206() {
        count=new int[20005];
    }

    public boolean search(int target) {
        return count[target]>0;
    }

    public void add(int num) {
        count[num]++;
    }

    public boolean erase(int num) {
        if(count[num]==0){return false;}
        count[num]--;
        return true;
    }
}
