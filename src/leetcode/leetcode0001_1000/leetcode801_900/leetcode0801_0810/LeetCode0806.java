package leetcode.leetcode0001_1000.leetcode801_900.leetcode0801_0810;

public class LeetCode0806 {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1;
        int len=0;
       for (char c:s.toCharArray()){
           if(len+widths[c-'a']>100){
               line+=1;
               len=widths[c-'a'];
           }else {
               len+=widths[c-'a'];
           }


       }
        return new int[]{line,len};
    }

}
