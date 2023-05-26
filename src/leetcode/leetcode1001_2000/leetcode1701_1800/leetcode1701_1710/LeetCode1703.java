package leetcode.leetcode1001_2000.leetcode1701_1800.leetcode1701_1710;

import java.util.Arrays;

public class LeetCode1703 {

    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        if (arr1.length > arr2.length) {
            return  this.doIt(arr1, arr2);
        } else {
            return this.doIt(arr2, arr1);

        }
    }


    private int[] doIt(int[] arr1, int[] arr2){
        StringBuilder sb =new StringBuilder();
        int index=0;
        for(int i=1;i<=arr1.length;i++){

            if (arr2.length-i>=0){
                if(arr1[arr1.length-i]+index+arr2[arr2.length-i]==2){
                    index=1;
                    sb.append("0").append(",");
                }else  if(arr1[arr1.length-i]+index+arr2[arr2.length-i]==3){
                    index=1;
                    sb.append("1").append(",");
                }else  if(arr1[arr1.length-i]+index+arr2[arr2.length-i]==1){
                    index=0;
                    sb.append("1").append(",");
                }else  if(arr1[arr1.length-i]+index+arr2[arr2.length-i]==0){
                    index=0;
                    sb.append("0").append(",");
                }
            }else {
                if(arr1[arr1.length-i]+index==2){
                    index=1;
                    sb.append("0").append(",");
                }else if(arr1[arr1.length-i]+index==1){
                    index=0;
                    sb.append("1").append(",");
                }else if(arr1[arr1.length-i]+index==0){
                    index=0;
                    sb.append("0").append(",");
                }
            }
        }
        String[] strs= sb.toString().split(",");
        int[] res=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            res[i]=Integer.parseInt(strs[i]);
        }
        return  res;
    }
}

