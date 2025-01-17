package leetcode.leetcode0001_1000.leetcode501_600.leetcode0591_0600;

import java.util.*;

public class LeetCode0599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        int m = list1.length, n = list2.length;
        Map<String, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            idxMap.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        String[] common = new String[m];
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            if (i > minSum) {
                break;
            }
            Integer j = idxMap.get(list2[i]);
            if (j == null) {
                continue;
            }
            int sum = i + j;
            if (sum < minSum) {
                minSum = sum;
                ptr = 1;
                common[0] = list2[i];
            } else if (sum == minSum) {
                common[ptr++] = list2[i];
            }
        }
        return Arrays.copyOf(common, ptr);
    }
    public String[] findRestaurant1(String[] list1, String[] list2) {
//        PriorityQueue<Help> priorityQueue=new PriorityQueue<Help>((a,b)->a.index> b.index?1:-1);
        List<Help> list=new ArrayList<>();

        int max=Integer.MAX_VALUE;
        for (int i=0;i<list1.length&&i<=max;i++){

            for (int j=0;j<list2.length&&i+j<=max;j++){
            if(list1[i].equals(list2[j])){
                max=Math.min(max,i+j);
//                priorityQueue.add(new Help(list1[i],i+j));
                list.add(new Help(list1[i],i+j));
                break;
            }
            }
        }
//        if(priorityQueue.size()==0)return new String[0];
        if(list.size()==0)return new String[0];
        StringBuilder sb=new StringBuilder();
        for (Help item:list){
            if (item.index!=max){
              list.remove(item);
            }
        }
//        Help help=priorityQueue.poll();
//        int index=help.index;
//        sb.append(help.restaurant);
//        while (priorityQueue.peek()!=null&&index ==(help=priorityQueue.poll()).index){
//            sb.append(","+help.restaurant);
//        }

        String[] restaurants = list.stream()
                .map(Help::getRestaurant)  // 提取 restaurant 字段
                .toArray(String[]::new);
        return restaurants;
    }

    public static void main(String[] args) {
        LeetCode0599 demo=new LeetCode0599();
        System.out.println(Arrays.stream(demo.findRestaurant(new String[]{"Shogun","Piatti","Tapioca Express","Burger King","KFC"},new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"})).toArray());
    }
}
class Help{
    String restaurant;

    int index;

    public Help(String restaurant, int index) {
        this.restaurant = restaurant;
        this.index = index;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
}
