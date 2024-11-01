package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hw0017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int x=0,y=0;
            String[] strs = input.split(";");
            int i=0;
        for(String s:strs){
            if(s.length()>1){
            if(s.charAt(0)=='A'){
                try {
                    i=Integer.parseInt(s.substring(1));
                    x-=i;
                }catch (Exception e){}
            }else if(s.charAt(0)=='S'){
                try {
                    i=Integer.parseInt(s.substring(1));
                    y-=i;
                }catch (Exception e){}
            }else if(s.charAt(0)=='W'){
                try {
                    i=Integer.parseInt(s.substring(1));
                   y+=i;
                }catch (Exception e){}
            }else if(s.charAt(0)=='D'){
                try {
                    i=Integer.parseInt(s.substring(1));
                    x+=i;
                }catch (Exception e){}
            }}

        }
        System.out.println(x+","+y);
    }}
}
