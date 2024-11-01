package leetcode.leetcode2001_3000.leetcode2801_2900.leetcode2841_2850;

public class LeetCode2844 {

    public int minimumOperations(String num) {
        if(num.indexOf('0')<0&&num.indexOf('5')<0)return num.length();
        int[] ch=new int[2];
        ch[0]=num.lastIndexOf('5');
        ch[1]=num.lastIndexOf('0');
       if(ch[0]>=0){
           if(num.substring(0,ch[0]).lastIndexOf('2')>=0||num.substring(0,ch[0]).lastIndexOf('7')>=0){
               ch[0]=Math.min(num.length()-num.substring(0,ch[0]).lastIndexOf('2')-2,num.length()-num.substring(0,ch[0]).lastIndexOf('7')-2);
               ch[0]=Math.min(ch[0],num.length());
           }else {
               ch[0]= num.length();
           }
       }else {
           ch[0]= num.length();
       }
        if(ch[1]>=0){
            if(num.substring(0,ch[1]).lastIndexOf('5')>=0||num.substring(0,ch[1]).lastIndexOf('0')>=0) {
                ch[1] = Math.min(num.length() - num.substring(0, ch[1]).lastIndexOf('5') - 2, num.length() - num.substring(0, ch[1]).lastIndexOf('0') - 2);
                ch[1] = Math.min(ch[1], num.length() - 1);
            }else {
                ch[1]= num.length()-1;
            }
        }else{
            ch[1]= num.length();
        }
        return Math.min(ch[1],ch[0]);
    }

    public static void main(String[] args) {
        LeetCode2844 demo=new LeetCode2844();
        demo.minimumOperations("0");
    }
}
