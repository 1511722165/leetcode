package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1081_1090;

import java.util.Arrays;

public class LeetCode1089 {
    public void duplicateZeros(int[] arr) {
        int[] a= Arrays.copyOf(arr,arr.length);
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(a[index]==0){
                arr[i]=a[index];
                i++;
                arr[Math.min(i, arr.length-1)]=a[index];
                index++;
            }else{
                arr[i]=a[index];
                index++;
            }
        }
    }

    public static void main(String[] args) {
        LeetCode1089 demo =new LeetCode1089();
        int [] a={1,0,2,3,0,4,5,0};
        demo.duplicateZeros(a);
    }
}
