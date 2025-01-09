package leetcode.leetcode2001_3000.leetcode2201_2300.leetcode2261_2270;

public class LeetCode2264 {

    static String [] arr=new String[]{"999","888","777","666","555","444","333","222","111","000"};
    public String largestGoodInteger(String num) {
        for (String s:arr){
            if(num.indexOf(s)>=0)return s;
        }
        return "";
    }
}
