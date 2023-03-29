package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=br.readLine())!=null){
            int b=1,c=0,d=0;
            int n=Integer.parseInt(str);
                while(n>1){
                    int temp=d+c;
                    d+=c;
                    c=b;
                    b=temp;
                    n--;
                }
            System.out.println(b+c+d);

        }
    }
}
