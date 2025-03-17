package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1011_1020;

public class LeetCode1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        if(sum%3!=0)return false;
        int avg=sum/3;
        int left=0,res=arr[0];
        while (res!=avg&&left<n-2){
            ++left;
            res+=arr[left];
        }
        if(res!=avg)return false;
        int right= arr.length-1;
        res=arr[right];
        while (res!=avg&&right>1){
            --right;
            res+=arr[right];

        }
        if(res!=avg)return false;
        if(left<right-1)return true;
        return false;
    }
}
