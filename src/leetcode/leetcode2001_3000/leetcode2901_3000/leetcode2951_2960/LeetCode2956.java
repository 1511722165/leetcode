package leetcode.leetcode2001_3000.leetcode2901_3000.leetcode2951_2960;

import java.util.Arrays;

public class LeetCode2956 {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
       int r1=0,r2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                r1++;
                r2++;
                while(i+1<nums1.length&&nums1[i]==nums1[i+1]){
                    r1++;
                    i++;
                }
                while(j+1<nums2.length&&nums2[j]==nums2[j+1]){
                    r2++;
                    j++;
                }
                i++;j++;
            }else if (nums1[i]<nums2[j]){
                i++;
            }
            else if (nums1[i]>nums2[j]){
                j++;
            }
        }
        return new int[] {r1,r2};
    }

    public int[] findIntersectionValues1(int[] nums1, int[] nums2) {
        int[] cnt1 = new int[101];
        for (int num : nums1){
            cnt1[num]++;
        }
        int[] ans = new int[2];
        for (int num : nums2){
            if (cnt1[num] != 0){
                ans[0] += cnt1[num] == -1 ? 0 : cnt1[num];
                cnt1[num] = -1;
                ans[1]++;
            }
        }
        return ans;
    }
}
