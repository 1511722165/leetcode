package leetcode.leetcode0001_1000.leetcode201_300.leetcode0241_0250;

public class LeetCode0242 {

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[26];
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int i=0;i<26;i++){
            if(arr[i]!=0)return false;
        }

        return true;
    }

}
