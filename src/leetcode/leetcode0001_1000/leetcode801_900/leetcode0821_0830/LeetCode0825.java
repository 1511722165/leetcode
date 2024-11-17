package leetcode.leetcode0001_1000.leetcode801_900.leetcode0821_0830;

import java.util.Arrays;

public class LeetCode0825 {

//    public int numFriendRequests(int[] ages) {
//        Arrays.sort(ages);
//        int ans = 0;
//        int temp = 0;
//        int res = 0;
//        for (int i = ages.length - 1; i >= 0; i--) {
//            if (ages[i] == temp) {
//                ans += res;
//            } else {
//                res = 0;
//                for (int j = i - 1; j >= 0; j--) {
//                    if (2 * ages[j] > ages[i] + 14) {
//                        res++;
//                    }else {
//                        break;
//                    }
//                }
//                ans += res;
//            }
//            temp = ages[i];
//        }
//        return ans;
//    }

    public int numFriendRequests(int[] ages) {
        int[] cnt=new int[121];
        for(int age:ages){
            cnt[age]++;
        }
        int ans=0;
        int ageY=0;
        int cntWindow=0;
        for(int ageX=0;ageX<cnt.length;ageX++){
            cntWindow+=cnt[ageX];
            if(ageY*2<=ageX+14){
                cntWindow-=cnt[ageY];
                ageY++;
            }
            if(cntWindow>0){
                ans+=cnt[ageX]*cntWindow-cnt[ageX];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode0825 demo = new LeetCode0825();
        demo.numFriendRequests(new int[]{16, 17, 18});
    }

}
