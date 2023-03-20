package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1011_1020;

public class LeetCode1012 {

    public int numDupDigitsAtMostN(int n) {
        int res=0;
        for(int i=11;i<=n;i++){
            StringBuilder sb=new StringBuilder(String.valueOf(i));
            if(sb.indexOf("0")!=String.valueOf(i).indexOf("0")||
                    String.valueOf(i).indexOf("1")!=String.valueOf(i).indexOf("1")||
                    String.valueOf(i).indexOf("2")!=String.valueOf(i).indexOf("2")||
                    String.valueOf(i).indexOf("3")!=String.valueOf(i).indexOf("3")||
                    String.valueOf(i).indexOf("4")!=String.valueOf(i).indexOf("4")||
                    String.valueOf(i).indexOf("5")!=String.valueOf(i).indexOf("5")||
                    String.valueOf(i).indexOf("6")!=String.valueOf(i).indexOf("6")||
                    String.valueOf(i).indexOf("7")!=String.valueOf(i).indexOf("7")||
                    String.valueOf(i).indexOf("8")!=String.valueOf(i).indexOf("8")||
                    String.valueOf(i).indexOf("9")!=String.valueOf(i).indexOf("9"))res++;
        }
        return  res;
    }

    public static void main(String[] args) {
        LeetCode1012 demo =new LeetCode1012();
        demo.numDupDigitsAtMostN(20);
    }
}
