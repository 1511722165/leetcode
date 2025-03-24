package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2251_2260;

public class LeetCode2255 {
    public int countPrefixes(String[] words, String s) {
        int ans=words.length;
        for (String word:words){
            if(s.indexOf(word)!=0){
                --ans;
            }
        }
        return ans;
    }

}
