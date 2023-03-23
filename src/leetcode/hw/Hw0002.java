package leetcode.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hw0002 {


//    写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
//
//    数据范围： 1 \le n \le 1000 \1≤n≤1000
//    输入描述：
//    第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。
//
//    输出描述：
//    输出输入字符串中含有该字符的个数。（不区分大小写字母）

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        char c1=in.next().toCharArray()[0];
        char[] sc=s.toCharArray();
        char c2=0;
        int res=0;
        if(c1>=65&&c1<=90){
            c2= (char) (c1+32);}

        if(c1>=97&&c1<=122){
            c2= (char) (c1-32);}
        for(char i:sc){
        if(i==c1||i==c2){
            res++;
        }
        }
       System.out.println(res);
    }


}
