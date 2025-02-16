package leetcode.lcr;

public class LCR147 {

    int[] queue;
    int right = 0;
    int min = Integer.MAX_VALUE;

    public LCR147() {
        queue = new int[30000];
    }

    public void push(int x) {
        queue[right] = x;
        min = Math.min(min, x);
        right++;
    }

    public void pop() {
        right--;
        if (queue[right] == min) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < right; i++) {
                min = Math.min(min, queue[i]);
            }
        }
    }

    public int top() {
        return queue[right - 1];
    }

    public int getMin() {
        return min;
    }
}
