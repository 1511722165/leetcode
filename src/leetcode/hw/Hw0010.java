package leetcode.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw0010 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
           String a=in.nextLine();
            char[] ch=a.toCharArray();
            int [] arr =new int[128];
            for(char c:ch){
                arr[c]=1;
            }
            System.out.println(Arrays.stream(arr).sum());
        }
    }
}
