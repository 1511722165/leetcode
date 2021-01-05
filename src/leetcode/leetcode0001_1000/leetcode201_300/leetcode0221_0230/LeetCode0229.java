package leetcode.leetcode0001_1000.leetcode201_300.leetcode0221_0230;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0229 {

//	public List<Integer> majorityElement(int[] nums) {
//		int count  =nums.length / 3;
//		Arrays.sort(nums);
//		int flag = 1;
//		List<Integer> list = new ArrayList<>();
//		for (int i = 1; i < nums.length; i++) {
//			if ((nums[i] ^ nums[i - 1]) == 0) {
//				flag++;
//			} else {
//				if (flag > count) {
//					list.add(nums[i - 1]);
//				}
//				flag = 1;
//			}
//		}
//
//		if (flag > count) {
//			list.add(nums[nums.length - 1]);
//		}
//		return list;
//	}
	
	public static List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();
        // can1和can2具有相同的起点
        int c1 = 0, c2 = 0, can1 = nums[0], can2 = nums[0];

        for (int num : nums) {
            // 投票过程，优先为can1投票
            if (can1 == num) {
                c1++;
                continue;
            }
            // 其次为can2投票
            if (can2 == num) {
                c2++;
                continue;
            }
            
            // can1和can2的投票必须分开，这里是当can1的票数归零时，重新投票
            if (c1 == 0 && num != can2) {
                can1 = num;
                c1++;
                continue;
            }
            
            // can2归零，注意不能和can1相等
            if (c2 == 0 && num != can1) {
                can2 = num;
                c2++;
                continue;
            }
            
            // 没有与can1和can2相等的，那么同时减一票
            c1--;
            c2--;
        }

        List<Integer> list = new ArrayList<>();
        
        // 再计数 -- 两次遍历也满足O(N)
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (can1 == num) c1++;
            if (can2 == num) c2++;
        }

        if (c1 > nums.length / 3) list.add(can1);
        // 注意由于一开始起点相同。所以需要排除can1==can2的情况
        if (can1 != can2 && c2 > nums.length / 3) list.add(can2);

        return list;
    }

	public static void main(String[] args) {
		LeetCode0229 demo = new LeetCode0229();
		int[] nums = { 3, 2, 3 };
		demo.majorityElement(nums);
	}
}
