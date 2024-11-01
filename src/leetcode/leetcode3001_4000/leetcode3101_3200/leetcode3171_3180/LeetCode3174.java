package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3171_3180;

import java.util.ArrayList;
import java.util.List;

public class LeetCode3174 {
//    public String clearDigits(String s) {
//        List list =new ArrayList<>(s.length());
//        for(int i=0,j=0;i<s.length();i++){
//            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
//                j--;
//                list.remove(j);
//            }else{
//                list.add(s.charAt(i));
//                j++;
//            }
//
//        }
//        return list.toString().replaceAll("[^a-z]","");
//    }

    public String clearDigits(String s) {
    StringBuilder sb=new StringBuilder();
        for(int i=0,j=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                j--;
                sb.deleteCharAt(j);
            }else{
                sb.append(s.charAt(i));
                j++;
            }

        }
        return sb.toString();
    }
}
