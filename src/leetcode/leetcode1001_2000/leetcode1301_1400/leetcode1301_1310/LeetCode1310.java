package leetcode.leetcode1001_2000.leetcode1301_1400.leetcode1301_1310;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1310 {
    public int[] xorQueries1(int[] arr, int[][] queries) {
        int [] res= new int[queries.length];
        int i=0;
        Map<String,Integer> map=new HashMap<String,Integer>();
        while (i<res.length){
            if(map.containsKey(queries[i][0]+"|"+queries[i][1])){
                res[i]=map.get(queries[i][0]+"|"+queries[i][1]);
            }else{
            int val=arr[queries[i][0]];
            for(int j=queries[i][0]+1;j<=queries[i][1];j++){
                val^=arr[j];
            }
            map.put(queries[i][0]+"|"+queries[i][1],val);
            res[i]=val;}
            i++;
        }
        return res;
    }
    public  int[] xorQueries(int[] arr, int[][] queries) {
        int len=arr.length;
        int [] data=new int[len];
        int [] res=new int[queries.length];
        int index=0;
        data[0]=arr[0];
        for (int i = 1; i < len; i++) {
            data[i]=data[i-1]^arr[i];
        }
        for (int[] query : queries) {
            int a = query[0], b = query[1];
            a = a - 1 >= 0 ? data[a - 1] : 0;
            res[index++] = data[b] ^ a;
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode1310 demo =new LeetCode1310();
        int[] arr={1,3,4,8};
int [][] queries= {{0,1},{1,2},{0,3},{3,3}};
        demo.xorQueries(arr,queries);
    }

}
