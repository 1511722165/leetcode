package leetcode.leetcode0001_1000.leetcode601_700.leetcode0621_0630;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode0624 {

    public int maxDistance1(List<List<Integer>> arrays) {
        PriorityQueue<Help0624> max=new PriorityQueue<Help0624>((a,b)->{return a.val< b.val?1:-1;});
        PriorityQueue<Help0624> min=new PriorityQueue<Help0624>((a,b)->{return a.val> b.val?1:-1;});
      for (int i=0;i<arrays.size();i++){
          int size=arrays.get(i).size();
          if(size>1){
              max.add(new Help0624(arrays.get(i).get(size-1),i));
              min.add(new Help0624(arrays.get(i).get(0),i));
          }else {
              max.add(new Help0624(arrays.get(i).get(0),i));
              min.add(new Help0624(arrays.get(i).get(0),i));
          }
      }

      Help0624 max1=max.poll();
      Help0624 min1=min.poll();
        if(max1.index== min1.index){
            Help0624 max2=max.poll();
            Help0624 min2=min.poll();

            return Math.abs(max1.val-min2.val)>Math.abs(max2.val-min1.val)?Math.abs(max1.val-min2.val):Math.abs(max2.val-min1.val);
        }else {
            return Math.abs(max1.val-min1.val);
        }

    }


    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> arr = arrays.get(i);
            int first = arr.get(0);
            int last = arr.get(arr.size() - 1);

            // 更新全局最小值和次小值
            if (first < min) {
                secondMin = min;
                min = first;
                minIndex = i;
            } else if (first < secondMin) {
                secondMin = first;
            }

            // 更新全局最大值和次大值
            if (last > max) {
                secondMax = max;
                max = last;
                maxIndex = i;
            } else if (last > secondMax) {
                secondMax = last;
            }
        }

        // 计算最大距离
        if (minIndex != maxIndex) {
            return max - min;
        } else {
            return Math.max(max - secondMin, secondMax - min);
        }
    }

    public static void main(String[] args) {
        LeetCode0624 demo=new LeetCode0624();
        List<Integer> list1= Arrays.asList( 1,2,3 );
        List<Integer> list2= Arrays.asList(4,5 );
        List<Integer> list3= Arrays.asList(1,2,3 );
        List<List<Integer>> list =new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        demo.maxDistance(list);
    }
}
class Help0624{

    int val;
    int index;

    public Help0624(int val, int index) {
        this.val = val;
        this.index = index;
    }
}