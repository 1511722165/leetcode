package leetcode.leetcode0001_1000.leetcode301_400.leetcode0301_0310;

import java.util.Arrays;

public class LeetCode0303 {


}

class NumArray {

    private int[] arr;

    public NumArray(int[] nums) {
        arr = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            arr[i] = arr[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
//        int[] a= Arrays.copyOfRange(arr,left,right+1);
//        return Arrays.stream(a).sum();


        return arr[right + 1] - arr[left];
    }

}