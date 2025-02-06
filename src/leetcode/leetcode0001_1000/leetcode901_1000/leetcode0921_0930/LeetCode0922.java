package leetcode.leetcode0001_1000.leetcode901_1000.leetcode0921_0930;

public class LeetCode0922 {
    public int[] sortArrayByParityII(int[] nums) {
        int left = 0;
        int right = 1;

        while (right < nums.length&&left<nums.length) {
            if (nums[left] % 2 == 0) {
                left += 2;
            } else {
                if (nums[right] % 2 == 1) {
                    right += 2;
                } else {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left += 2;
                    right += 2;
                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        LeetCode0922 demo=new LeetCode0922();
        demo.sortArrayByParityII(new int[]{4,2,5,7});
    }
}
