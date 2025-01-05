package leetcode.leetcode0001_1000.leetcode301_400.leetcode0341_0350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0350 {


    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int t1;
        int t2;
        int right = 0, left = 0, size = 0;
        while (right != -1 && left != -1) {
            t1 = nums1[left];
            t2 = nums2[right];
            if (t1 == t2) {
                list1.add(t1);
                int temp1 = getIndex(left, nums1);
                int count;
                if (temp1 != -1) {
                    count = temp1 - left;
                } else {
                    count = nums1.length - left;
                }
                left = temp1;
                int temp2 = getIndex(right, nums2);
                if (temp2 != -1) {
                    count = Math.min(count, temp2 - right);
                } else {
                    count = Math.min(count, nums2.length - right);
                }
                right = temp2;
                list2.add(count);
                size += count;
            } else if (t1 < t2) {
                left = getIndex(left, nums1);
                // if(left==-1)break;
            } else {
                //t1>t2
                right = getIndex(right, nums2);
                //  if(right==-1)break;
            }

        }
        if (size > 0) {
            int res[] = new int[size];
            int index = 0;
            for (int i = 0; i < list1.size(); i++) {

                for (int j = 0; j < list2.get(i); j++) {
                    res[index] = list1.get(i);
                    index++;
                }

            }

            return res;
        }

        return new int[0];
    }

    private int getIndex(int index, int[] nums) {
        if (index == nums.length - 1) {
            return -1;
        }
        int temp = nums[index];
        for (int i = index; i < nums.length; i++) {
            if (temp != nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
