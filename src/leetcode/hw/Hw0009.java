package leetcode.hw;

import java.util.Scanner;

public class Hw0009 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s=in.next();
            char[] ch=s.toCharArray();
            int [] arr=new int[10];
            StringBuilder sb =new StringBuilder();
           for(int i=ch.length-1;i>=0;i--){
               if(arr[ch[i]-48]!=1){
                    sb.append(ch[i]);
                   arr[ch[i]-48]=1;
               }
           }
           System.out.println(sb.toString());
        }
    }
}
