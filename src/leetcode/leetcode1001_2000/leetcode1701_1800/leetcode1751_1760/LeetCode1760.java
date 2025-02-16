package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1751_1760;

import java.util.PriorityQueue;

public class LeetCode1760 {

    public int minimumSize(int[] nums, int maxOperations) {
        // 获取最大的球数
        int left = 1, right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }

        // 二分法找最小最大开销
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, maxOperations, mid)) {
                right = mid; // 试图减小最大值
            } else {
                left = mid + 1; // 增加最大值
            }
        }

        return left;
    }

    // 判断是否可以将每个袋子分割成不超过maxSize个球且操作次数不超过maxOperations
    private boolean canDivide(int[] nums, int maxOperations, int maxSize) {
        int operations = 0;

        for (int num : nums) {
            // 如果一个袋子球的数量大于maxSize，看看需要多少次操作
            if (num > maxSize) {
                operations += (num - 1) / maxSize; // 计算需要多少次操作
            }
            if (operations > maxOperations) {
                return false; // 如果操作次数超出了限制，返回false
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LeetCode1760 demo=new LeetCode1760();
        System.out.println(demo.minimumSize(new int[]{9},2));
    }
}
