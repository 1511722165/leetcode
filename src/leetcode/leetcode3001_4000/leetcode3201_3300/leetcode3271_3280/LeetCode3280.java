package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3271_3280;

public class LeetCode3280 {

    public String convertDateToBinary(String date) {
//        String[] cs = date.split("-");
//        return Integer.toBinaryString(Integer.parseInt(cs[0])) + "-" + Integer.toBinaryString(Integer.parseInt(cs[1])) + "-" + Integer.toBinaryString(Integer.parseInt(cs[2]));
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(0,4))));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(5,7))));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(date.substring(8))));
        return sb.toString();
//        return Integer.toBinaryString(Integer.parseInt(date.substring(0,4))) + "-"
//                + Integer.toBinaryString(Integer.parseInt(date.substring(5,7))) + "-"
//                + Integer.toBinaryString(Integer.parseInt(date.substring(8,10)));

    }

    public static void main(String[] args) {
        LeetCode3280 demo = new LeetCode3280();
        demo.convertDateToBinary("2080-02-29");
    }

}
