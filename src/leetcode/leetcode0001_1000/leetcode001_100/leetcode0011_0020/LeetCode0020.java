package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LeetCode0020 {
	public boolean isValid1(String s) {
		Deque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')'&&!stack.isEmpty() && stack.pop() == '(') {
			} else if (s.charAt(i) == '}'&&!stack.isEmpty() && stack.pop() == '{') {
			} else if (s.charAt(i) == ']'&&!stack.isEmpty() && stack.pop() == '[') {
			} else {
				return false;
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}

	
	
	public boolean isValid(String s) {
        if(s==null||s.length()==0){
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            if(c==')'&&(stack.isEmpty()||stack.pop()!='(')){
                return false;
            }

            if(c==']'&&(stack.isEmpty()||stack.pop()!='[')){
                return false;
            }

            if(c=='}'&&(stack.isEmpty()||stack.pop()!='{')){
                return false;
            }
        }

        return stack.isEmpty();

    }
	public static void main(String[] args) {
		LeetCode0020 demo = new LeetCode0020();
		demo.isValid("()[]{}");
	}
}
