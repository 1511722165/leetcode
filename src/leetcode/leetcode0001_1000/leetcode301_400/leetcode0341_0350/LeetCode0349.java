package leetcode.leetcode0001_1000.leetcode301_400.leetcode0341_0350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0349 {


    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int t1;
        int t2;
        int right=0,left=0;
        while (right!=-1&&left!=-1){
            t1=nums1[left];
            t2=nums2[right];
            if(t1==t2){
                list.add(t1);
                left=getIndex(left,nums1);
                right=getIndex(right,nums2);
            }else if(t1<t2){
                left=getIndex(left,nums1);
               // if(left==-1)break;
            }else {
                //t1>t2
                right=getIndex(right,nums2);
              //  if(right==-1)break;
            }

        }
        return list.stream().mapToInt(i->i).toArray();

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
