package leetcode.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hw0027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num=Integer.parseInt(str[0]);
        String x=str[num+1];
        int[] xc=new int[26];
        for(char c:x.toCharArray()){
            xc[c-'a']++;
        }
        List<String> list =new ArrayList<>();
        int k=Integer.parseInt(str[num+2]);
        for(int i=1;i<=num;i++){
            if(str[i].length()==x.length()&&!x.equals(str[i])){
                int[] sc=new int[26];
                for(char c:str[i].toCharArray()){
                    sc[c-'a']++;
                }
                boolean flag=true;
                for(int j=0;j<26;j++){
                    if(sc[j]!=xc[j]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    list.add(str[i]);
                }
            }
        }
        System.out.println(list.size());
        if(list.size()>=k){
            Collections.sort(list);
            System.out.println(list.get(k-1));
        }
    }
}
