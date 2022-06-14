package leetcode.leetcode0001_1000.leetcode601_700.leetcode0621_0630;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode0630 {

    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (o1, o2)->{
            return o1[1] - o2[1];
        });
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o2 -o1);
        int total = 0;
        for(int[] cnt : courses){
            int dur = cnt[0] , last = cnt[1];
            if(total + dur <= last){
                total += dur;
                heap.offer(dur);
            } else if(!heap.isEmpty() && heap.peek() > dur){
                total -= heap.poll() - dur;
                heap.offer(dur);
            }
        }
        return heap.size();
    }

}
