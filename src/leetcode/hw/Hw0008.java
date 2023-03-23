package leetcode.hw;

import java.util.*;

public class Hw0008 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
        Map<Integer,Integer> map =new HashMap<Integer,Integer>(4*len/3);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
           if(map.containsKey(a)){
               map.put(a,map.get(a)+b);
           }else{
               map.put(a,b);
           }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
