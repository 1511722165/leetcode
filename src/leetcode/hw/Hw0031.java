package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0031 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        char[] ch= br.readLine().toCharArray();
        StringBuilder sb =new StringBuilder();
        StringBuilder sb2 =new StringBuilder();
        for(char c:ch){
            if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
                sb.append(c);
            }else{
                sb.append(" ");
            }
        }
        String[] srr=sb.toString().split(" ");
        sb=null;
        for(int i=0;i<srr.length;i++){
            if(srr[srr.length-1-i]!=null){
                sb2.append(srr[srr.length-1-i]+" ");
            }
        }
        System.out.println(sb2.toString());
    }
}
