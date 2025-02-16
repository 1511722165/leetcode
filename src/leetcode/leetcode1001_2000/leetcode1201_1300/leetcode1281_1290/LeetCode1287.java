package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1281_1290;

public class LeetCode1287 {

    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        int size=len/4;
        int i=0;
        while (i<len){
            if(arr[i]==arr[i+size])return arr[i];
            i++;
        }
        return 0;
    }
}
