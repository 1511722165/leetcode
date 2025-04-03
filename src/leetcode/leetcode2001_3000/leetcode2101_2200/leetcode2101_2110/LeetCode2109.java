package leetcode.leetcode2001_3000.leetcode2101_2200.leetcode2101_2110;

public class LeetCode2109 {

    public String addSpaces(String s, int[] spaces) {
            StringBuilder sb=new StringBuilder();
            int index=0;
            int size=spaces.length;
            for (int i=0;i<s.length();i++){

                if(index!=-1&&spaces[index]==i){
                    sb.append(" ");
                    ++index;
                    if(index==size){
                        index=-1;
                    }
                }
                sb.append(s.charAt(i));
            }
        return sb.toString();
    }


    public static void main(String[] args) {
        LeetCode2109 demo=new LeetCode2109();
        demo.addSpaces("spacing",new int[]{0,1,2,3,4,5,6});
    }
}
