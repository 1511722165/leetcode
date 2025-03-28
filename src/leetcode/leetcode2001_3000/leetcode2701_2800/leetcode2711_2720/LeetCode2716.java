package leetcode.leetcode2001_3000.leetcode2701_2800.leetcode2711_2720;

public class LeetCode2716 {

    public int minimizedStringLength(String s) {
        boolean[] flag=new boolean[26];
        for (int i=0;i<s.length();i++){
            flag[s.charAt(i)-'a']=true;
        }
        int ans=0;
        for (boolean f:flag){
            if(f)++ans;
        }
        return ans;
    }
}
