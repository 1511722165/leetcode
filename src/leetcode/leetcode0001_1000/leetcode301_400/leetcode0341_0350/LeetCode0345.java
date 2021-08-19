package leetcode.leetcode0001_1000.leetcode301_400.leetcode0341_0350;

public class LeetCode0345 {

    public String reverseVowels(String s) {
        int len=s.length();
        int i=0;int j=len-1;
        String demo="aeiouAEIOU";
        char[] chars=s.toCharArray();
        while(i<j){
            if(demo.indexOf(chars[i])>=0&&demo.indexOf(chars[j])>=0){
                char temp =chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;j--;
            }else if(demo.indexOf(chars[i])>=0){
                j--;
            }else if(demo.indexOf(chars[j])>=0){
                i++;
            }else{
                i++;j--;
            }
        }
        return String.valueOf(chars);
    }

}
