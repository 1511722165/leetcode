package leetcode.leetcode0001_1000.leetcode801_900.leetcode0851_0860;

public class LeetCode0852 {

    public int peakIndexInMountainArray(int[] arr) {
    int res=0;
    while(arr[res]<arr[res+1]&&res<arr.length-1){
        res++;
    }
    return res;
    }

}
