package leetcode.leetcode3001_4000.leetcode3001_3100.leetcode3061_3070;

import java.util.PriorityQueue;

public class LeetCode3066 {

    public int minOperations(int[] nums, int k) {
        int size=nums.length;
        PriorityQueue<Long> queue=new PriorityQueue();
        for (Integer i:nums){
            queue.offer(i*1l);
        }
        int count=0;
        while (size>=2){
            Long one=queue.poll();
            Long two=queue.poll();
            if(one<k&&two>=k){
                return count+1;
            }else if (one<k&&two<k){
                size--;
                queue.offer(one*2+two);
                count++;
            }else if(one>=k){
                return count;
            }
        }
        return count;
    }
}
