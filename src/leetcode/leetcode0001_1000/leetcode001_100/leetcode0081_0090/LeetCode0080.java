package leetcode.leetcode0001_1000.leetcode001_100.leetcode0081_0090;

import java.util.Arrays;

public class LeetCode0080 {

    public int removeDuplicates1(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 2]) {
                nums[i] = 10001;
                flag++;
            }
        }
        Arrays.sort(nums);
        return nums.length - flag;
    }

    public int removeDuplicates(int[] nums) {
        int len = nums.length, cur = 0, pre = 1, index = nums[0];
        boolean flag = false;
        while (pre < len) {
            if (index == nums[pre]) {
                //相等
                pre++;
                flag = true;
            } else {
                if (flag) {
                    nums[cur + 1] = index;
                    nums[cur] = index;
                    cur += 2;
                } else {
                    nums[cur] = index;
                    cur += 1;
                }
                //不等
                index = nums[pre];
                flag = false;
                pre++;
            }
        }

        if (flag) {
            nums[cur + 1] = index;
            nums[cur] = index;
            cur += 2;
        } else {
            nums[cur] = index;
            cur += 1;
        }

        return cur;
    }

    public static void main(String[] args) {
        LeetCode0080 demo = new LeetCode0080();
        demo.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    }
}
