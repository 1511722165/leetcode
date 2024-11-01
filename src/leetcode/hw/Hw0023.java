package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s=br.readLine())!=null){
            int min=s.length();
            int[] arr=new int[26];
            for(char c :s.toCharArray()){
                arr[c-97]++;
            }
            for(Integer i:arr){
                if(i>0){
                    min=Math.min(min,i);}
            }
            StringBuilder sb =new StringBuilder();
            for(char c :s.toCharArray()){
                if(min<arr[c-97])
                    sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
