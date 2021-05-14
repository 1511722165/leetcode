package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

public class LeetCode0012 {

    public String intToRoman(int num) {
        String sb ="";
        int ge=num%10;
        num=num/10;
        int shi=num%10;
        num=num/10;
        int bai=num%10;
        num=num/10;
        int qian=num%10;
        switch (qian){
            case 1:
                sb+=("M");
                break;
            case 2:
                sb+=("MM");
                break;
            case 3:
                sb+=("MMM");
                break;
            default:break;
        }
        switch (bai){
            case 1:
                sb+=("C");
                break;
            case 2:
                sb+=("CC");
                break;
            case 3:
                sb+=("CCC");
                break;
            case 4:
                sb+=("CD");
                break;
            case 5:
                sb+=("D");
                break;
            case 6:
                sb+=("DC");
                break;
            case 7:
                sb+=("DCC");
                break;
            case 8:
                sb+=("DCCC");
                break;
            case 9:
                sb+=("CM");
                break;
            default:break;
        }
        switch (shi){
            case 1:
                sb+=("X");
                break;
            case 2:
                sb+=("XX");
                break;
            case 3:
                sb+=("XXX");
                break;
            case 4:
                sb+=("XL");
                break;
            case 5:
                sb+=("L");
                break;
            case 6:
                sb+=("LX");
                break;
            case 7:
                sb+=("LXX");
                break;
            case 8:
                sb+=("LXXX");
                break;
            case 9:
                sb+=("XC");
                break;
            default:break;
        }

        switch (ge){
            case 1:
                sb+=("I");
                break;
            case 2:
                sb+=("II");
                break;
            case 3:
                sb+=("III");
                break;
            case 4:
                sb+=("IV");
                break;
            case 5:
                sb+=("V");
                break;
            case 6:
                sb+=("VI");
                break;
            case 7:
                sb+=("VII");
                break;
            case 8:
                sb+=("VIII");
                break;
            case 9:
                sb+=("IX");
                break;
            default:break;
        }
        return sb;
    }

    public static void main(String[] args) {
        LeetCode0012 demo =new LeetCode0012();
        demo.intToRoman(600);
    }
}
