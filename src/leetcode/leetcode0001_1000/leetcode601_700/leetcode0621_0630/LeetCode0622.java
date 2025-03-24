package leetcode.leetcode0001_1000.leetcode601_700.leetcode0621_0630;

public class LeetCode0622 {

    int size;
    int left,right;
    int[] arr;
    int use;

    public LeetCode0622(int k) {
        size=k;
        arr=new int[k];
        left=0;
        right=0;
    }

    public boolean enQueue(int value) {
        if(use==size)return false;
        arr[right]=value;
        ++right;
        if(right==size)right=0;
        ++use;
        return true;
    }

    public boolean deQueue() {
        if(use==0)return false;
        ++left;
        if(left==size)left=0;
        --use;
        return true;
    }

    public int Front() {
        if(use==0)return -1;
        return arr[left];
    }

    public int Rear() {
        if(use==0)return -1;
        if(right==0)return arr[size-1];
        return arr[right-1];
    }

    public boolean isEmpty() {
        return use==0;
    }

    public boolean isFull() {
        return size==use;
    }

}
