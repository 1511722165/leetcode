package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hw0034 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=br.readLine())!=null){
            char [] ch =input.toCharArray();
            Arrays.sort(ch);
            StringBuilder sb =new StringBuilder();
            for (char c:ch){
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
