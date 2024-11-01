package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Hw0018 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int a=0,b=0,c=0,d=0,e=0,err=0,pri=0;
        while((str=buffer.readLine())!=null){
            int index=str.indexOf('~');
            long num1=strToInt(str.substring(0,index));
            long num2=strToInt(str.substring(index+1));
            long t=num1>>24;
            if(t==0||t==127) continue;
            if(num2<=0||num2>=0XFFFFFFFFL||(((num2 ^ 0XFFFFFFFFL)+1)|num2)!=num2){
                err++;
                continue;
            }
            if(t<=0)err++;
            else if(t>=1&&t<=126){
                a++;
                if(t==10) pri++;
            }else if(t>=128&&t<=191){
                b++;
                if(num1>>20==0xAC1)pri++;
            }else if(t>=192&&t<=223){
                c++;
                if(num1>>16==0xC0A8)pri++;
            }else if(t>=224&&t<=239)d++;
            else if(t>=240&&t<=255)e++;
        }
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+err+" "+pri);
    }
    public static long strToInt(String str){
        char[] cs=str.toCharArray();
        long res=0,tmp=0,flag=0;
        for(char c:cs){
            if(c=='.'){
                res=res<<8|tmp;
                tmp=0;
                flag++;
            }
            else if(c>='0'&&c<='9'){
                tmp=tmp*10+c-'0';
                flag=0;
            }else{
                return -1;
            }
            if(flag>=2) return -1;

        }
        res=res<<8|tmp;
        return res;
    }
}
