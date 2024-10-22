package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3181_3190;

public class LeetCode3184 {

    public int countCompleteDayPairs(int[] hours) {
        int[] arr=new int[24];
        for(int i:hours){
            int j=i%24;
            arr[j]++;
        }
        int res=0;
        if(arr[0]>=2){
            res+=(arr[0]*(arr[0]-1))/2;
        }
        if(arr[12]>=2){
            res+=(arr[12]*(arr[12]-1))/2;
        }
        for(int i=1;i<=11;i++){
            res+=arr[i]*arr[24-i];
        }
        return res;
    }

}
