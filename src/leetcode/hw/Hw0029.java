package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw0029 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        encrypt(br.readLine());
        decrypt(br.readLine());
    }

    public static void encrypt(String str){
        char[] ch=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='9'){
               // ch[i]='0';
                sb.append('0');
            }
            if(ch[i]=='Z'){
               // ch[i]='a';
                sb.append('a');
            }
            if(ch[i]=='z'){
               // ch[i]='A';
                sb.append('A');
            }
            if(ch[i]>='0'&&ch[i]<'9'){
               // ch[i]++;
                sb.append( (char)(ch[i]+1));
            }
            if(ch[i]>='a'&&ch[i]<'z'){
              //  ch[i]-=32;
                sb.append( (char)(ch[i]-31));
            }
            if(ch[i]>='A'&&ch[i]<'Z'){
               // ch[i]+=32;
                sb.append( (char)(ch[i]+33));
            }
        }
        System.out.println(sb.toString());

    }

    public static void decrypt(String str){
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if (ch[i] == '0') {
               // ch[i] = '0';
                sb.append( '9');
            }
            if (ch[i] == 'A') {
                //ch[i] = 'a';
                sb.append( 'z');
            }
            if (ch[i] == 'a') {
//                ch[i] = 'A';
                sb.append( 'Z');
            }
            if (ch[i] > '0' && ch[i] <= '9') {
                //ch[i]--;
                sb.append((char)(ch[i]-1));
            }
            if (ch[i] > 'a' && ch[i] <= 'z') {
                //ch[i] -= 32;
                sb.append((char)(ch[i]-33));
            }
            if (ch[i] >'A' && ch[i] <= 'Z') {
                //ch[i] += 32;
                sb.append((char)(ch[i]+31));
            }
        }
        System.out.println(sb.toString());
    }


}
