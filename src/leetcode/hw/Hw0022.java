package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine())!=null){
                int a=Integer.parseInt(s);
                if(a==0){break;}
                int count=0;
                int temp=0;
                while (a>2){
                    temp=a%3;
                    a=a/3;
                    count+=a;
                    a+=temp;
            }
                if(a==2){
                    count++;
                }
                System.out.println(count);
        };
    }
}
