package leetcode.leetcode0001_1000.leetcode501_600.leetcode0551_0560;

public class LeetCode0557 {

    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String[] str=sb.toString().split(" ");
        StringBuilder sb1=new StringBuilder();
        for (String st:str){
            sb1.insert(0," ");
            sb1.insert(0,st);
        }
        return sb1.substring(0,s.length());
    }
}
