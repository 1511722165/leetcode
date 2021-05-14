package leetcode.leetcode0001_1000.leetcode001_100.leetcode0001_0010;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetCode0010 {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0 && s.length() > 0) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        char temp = 0;
        int index=0;
        for (int i = 0; i < p.length(); ) {
        	if(index>=s.length()){
        		return true;
			}
			//字符相等
        	else if(s.charAt(index)==p.charAt(i)){
        		temp=p.charAt(i);
				i++;index++;
			}
        	//.任意匹配
        	else if(p.charAt(i)=='.'){
				temp=s.charAt(index);
				i++;index++;
			}
        	//匹配前一个
        	else if(p.charAt(i)=='*'&&s.charAt(index)==temp){
				temp=p.charAt(i);
				index++;
			}
        	//随便匹配
        	else if(p.charAt(i)=='*'&&temp=='.'){
        		if(i==p.length()-1){
        			return true;
				}
				temp=p.charAt(i);
				index++;
			}
        	else{
        		temp=' ';
        		i++;
			}
        }
        if(index<s.length()){
        	return false;
		}
        return true;
    }


	public boolean isMatch1(String s, String p) {
		return s.matches("^"+p+"$");
	}
    public static void main(String[] args) {
        LeetCode0010 demo = new LeetCode0010();
        demo.isMatch("aa", "a");
    }
}
