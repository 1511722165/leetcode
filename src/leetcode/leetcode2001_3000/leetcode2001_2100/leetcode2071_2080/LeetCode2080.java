package leetcode.leetcode2001_3000.leetcode2001_2100.leetcode2071_2080;

import java.util.HashMap;

public class LeetCode2080 {
    int[] arr;
    HashMap<String,Integer> hashMap;
    public LeetCode2080() {
    }

    public LeetCode2080( int[] arr) {
        this.arr=arr;
        this.hashMap=new HashMap<>();
    }

    public int query(int left, int right, int value) {
        String key=new String(left+"|"+right+"|"+value);
        if(hashMap.containsKey(key)){
            return hashMap.get(key);
        }

        int count=0;
        for (int i=left;i<=right;i++){
            if(arr[i]==value)count++;
        }
        hashMap.put(key,count);
        return count;
    }
}
