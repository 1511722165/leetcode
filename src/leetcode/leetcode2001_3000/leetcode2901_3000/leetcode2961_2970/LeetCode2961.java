package leetcode.leetcode2001_3000.leetcode2901_3000.leetcode2961_2970;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LeetCode2961 {

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<variables.length;i++){
            while(variables[i][0]>10){
                variables[i][0]%=10;
            }
            int temp=0;
            switch (variables[i][0]){
                case 1:temp=1; break;
                case 2:if (variables[i][1]%4==0){
                    temp=6;
                }else if (variables[i][1]%4==1) {
                    temp=2;
                }else if (variables[i][1]%4==2) {
                    temp=4;
                }else if (variables[i][1]%4==3) {
                    temp=8;
                } break;
                case 3:if (variables[i][1]%4==0){
                    temp=1;
                }else if (variables[i][1]%4==1) {
                    temp=3;
                }else if (variables[i][1]%4==2) {
                    temp=9;
                }else if (variables[i][1]%4==3) {
                    temp=7;
                } break;
                case 4:  if (variables[i][1]%2==0){
                    temp=6;
                }else {
                    temp=4;
                }
                break;
                case 5:temp=5; break;
                case 6:temp=6; break;
                case 7:if (variables[i][1]%4==0){
                    temp=1;
                }else if (variables[i][1]%4==1) {
                    temp=7;
                }else if (variables[i][1]%4==2) {
                    temp=9;
                }else if (variables[i][1]%4==3) {
                    temp=3;
                } break;
                case 8:  if (variables[i][1]%4==0){
                    temp=6;
                }else if (variables[i][1]%4==1) {
                    temp=8;
                }else if (variables[i][1]%4==2) {
                    temp=4;
                }else if (variables[i][1]%4==3) {
                    temp=2;
                }
                break;
                case 9:
                    if (variables[i][1]%2==0){
                        temp=1;
                    }else {
                        temp=9;
                    }
                    break;
                default:
                break;
            }
            BigDecimal base=BigDecimal.ONE;
            BigDecimal add=new BigDecimal(temp);
           for(int j=1;j<=variables[i][2];j++){
               base=base.multiply(add);
           }
           BigDecimal remainder =base.remainder(new BigDecimal(variables[i][3]));
           if (remainder.intValue()==target){
               list.add(i);
           }
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode2961 demo=new LeetCode2961();
        demo.getGoodIndices(new int[][]{{2,3,3,10}},1);
    }
}
