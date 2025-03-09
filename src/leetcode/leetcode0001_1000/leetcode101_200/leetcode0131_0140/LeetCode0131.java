package leetcode.leetcode0001_1000.leetcode101_200.leetcode0131_0140;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0131 {

    List<List<String>> ans=new ArrayList<>();
    int[][] memo;
    public List<List<String>> partition(String s) {
        int n=s.length();
        memo=new int[n][n];
        for(int i=0;i<n;i++)
            memo[i][i]=1;
        getSubstring(s,0,n-1,new ArrayList<String>(),0);
        return ans;
    }
    public void getSubstring(String t,int start,int end,ArrayList<String> temp,int index){
        if(start>end)
        {
            ans.add(new ArrayList<String>(temp));
            return;
        }
        for(int i=start;i<=end;i++){
            if(memo[start][i]==1){
                temp.add(t.substring(start,i+1));
                getSubstring(t,i+1,end,temp,index+1);
                temp.remove(index);
            }
            else if(memo[start][i]==-1){
                continue;
            }
            else{
                int l=start,r=i;
                int flag=0;
                while(l<r){
                    if(t.charAt(l++)!=t.charAt(r--)){
                        memo[start][i]=-1;
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    memo[start][i]=1;
                    temp.add(t.substring(start,i+1));
                    getSubstring(t,i+1,end,temp,index+1);
                    temp.remove(index);
                }
            }
        }
    }
}
