package leetcode.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hw0014 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len =in.nextInt();
        List<String> list =new ArrayList<String>(len);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s=in.next();
            list.add(s);
        }
        Collections.sort(list);
        list.forEach(s -> {System.out.println(s);});
    }
}
