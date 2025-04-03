package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2271_2280;

public class LeetCode2278 {

    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int count=0;
        for (char c:s.toCharArray()){
            if(c==letter)++count;
        }
        return count*100/n;
    }

}
