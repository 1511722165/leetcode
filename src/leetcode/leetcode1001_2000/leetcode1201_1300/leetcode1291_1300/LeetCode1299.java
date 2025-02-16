package leetcode.leetcode1001_2000.leetcode1201_1300.leetcode1291_1300;

public class LeetCode1299 {

    public int[] replaceElementsq(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        int max = -1;
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                res[i] = -1;
            } else {
              if(max==arr[i]||max==-1){
                  //重新找最大值
                  max=-1;
                  for (int j=i+1;j<len;j++)max=Math.max(max,arr[j]);
                  res[i]=max;
              }else {
                  res[i]=max;
              }
            }
        }
        return res;
    }


    public int[] replaceElements(int[] arr) {
        int max=-1;
        int res[]=new int[arr.length];
        for (int j=arr.length-1;j>=0;j--){
            res[j]=max;
            max=Math.max(max,arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode1299 demo=new LeetCode1299();
        demo.replaceElements(new int[]{17,18,5,4,6,1});
    }
}
