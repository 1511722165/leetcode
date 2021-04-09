package leetcode.leetcode0001_1000.leetcode201_300.leetcode0221_0230;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0225 {
    private List<Integer> list;

    public LeetCode0225() {
    list =new ArrayList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
    list.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int temp=list.get(list.size()-1);
        list.remove(list.size()-1);
        return temp;
    }

    /** Get the top element. */
    public int top() {
        return list.get(list.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.size()>0?false:true;
    }
}
