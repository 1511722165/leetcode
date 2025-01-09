package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1071_1080;

public class LeetCode1078 {


    public String[] findOcurrences(String text, String first, String second) {
        String[] str = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length - 2; i++) {
            if (str[i].equals(first) && str[i + 1].equals(second)) {
                sb.append(str[i + 2] + " ");
            }
        }
        if(sb.length()==0)return new String[0];
        return sb.toString().split(" ");
    }
}
