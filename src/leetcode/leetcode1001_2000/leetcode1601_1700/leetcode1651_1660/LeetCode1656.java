package leetcode.leetcode1001_2000.leetcode1601_1700.leetcode1651_1660;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1656 {

    private String[] strs;
    int n;
    int ptr;


    public LeetCode1656(int n) {
        strs=new String[n+1];
        ptr=1;
        this.n=n;
    }

    public List<String> insert(int idKey, String value) {
        strs[idKey]=value;
        if(idKey==ptr){
            List<String> res=new ArrayList<>();
          while (ptr<=n&&strs[ptr]!=null){
              res.add(strs[ptr]);
              ptr++;
          }
          return res;
        }
        return new ArrayList<>();

    }

}
