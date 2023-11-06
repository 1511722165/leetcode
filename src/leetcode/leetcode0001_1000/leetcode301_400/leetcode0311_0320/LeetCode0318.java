package leetcode.leetcode0001_1000.leetcode301_400.leetcode0311_0320;

public class LeetCode0318 {

    public int maxProduct(String[] words) {
        int[][] pd = new int[words.length][2];
        String[] str = new String[words.length];
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            String s = "";
            int index = 0;
            for (int j = 0; j < 26; j++) {

                if (words[i].indexOf(j + 97) >= 0) {
                    s += (char) (j + 97) + ",";
                    index++;
                }
                str[i] = s;
                pd[i][0] = index;
                pd[i][1] = words[i].length();
            }
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (pd[i][0] + pd[j][0] > 26) {
                    break;
                }
                Boolean flag = true;
                if (pd[i][0] >= pd[j][0]&&flag) {
                    String[] ss = str[j].split(",");
                    for (String s : ss) {
                        if (str[i].indexOf(s) >=0) {
                            flag = false;
                            break;
                        }
                    }
                }else
                if (pd[i][0] < pd[j][0]&&flag) {
                    String[] ss = str[i].split(",");
                    for (String s : ss) {
                        if (str[j].indexOf(s) >= 0) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag){
                    res=Math.max(res, pd[i][1]* pd[j][1]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode0318 demo= new LeetCode0318();
        String[] words={"eae","ea","aaf","bda","fcf","dc","ac","ce","cefde","dabae"};
        demo.maxProduct(words);

    }
}
