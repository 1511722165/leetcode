package leetcode.leetcode0001_1000.leetcode001_100.leetcode0011_0020;

import java.util.*;

public class LeetCode0018 {

    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set set = new HashSet();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                for (int k = i + 1; k < j; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (!set.contains(nums[i] + "." + nums[j])) {
                            List<Integer> item = new ArrayList<>();
                            item.add(nums[i]);
                            item.add(nums[j]);
                            item.add(nums[k]);
                            list.add(item);
                            set.add(nums[i] + "." + nums[j]);
                        }

                    }
                }
            }
        }
        return list;
    }


    public List<List<Integer>> threeSum(int[] nums) {
        List res = new ArrayList();
        Arrays.sort(nums);
        int len = nums.length - 1;
        if (nums[0] > 0 || nums[len] < 0) {
            return res;
        }
        int countZero = 0, fu = -1, zh = -1;
        for (int i = 0; i <= len; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
            if (nums[i] < 0) {
                fu = i;
            }
            if (nums[i] > 0) {
                zh = i;
                break;
            }
        }
        //000
        if (countZero >= 3) {
            res.add(Arrays.asList(0, 0, 0));
        }

        if(fu==-1||zh==-1){
            return res;
        }
        //负正0
        if (countZero > 0) {
            int temp = 0;
            for (int i = 0; i <= fu; i++) {
                if (temp != nums[i]) {
                    temp = nums[i];
                    for (int j = zh; j <= len; j++) {
                        if (nums[i] + nums[j] == 0) {
                            res.add(Arrays.asList(nums[i], 0, nums[j]));
//                            j=len+1;
                            break;
                        }
                    }
                }
            }
        }
        Set<List<Integer>> set=new HashSet<>();
        //负负正
        for (int i = zh; i <= len; i++) {
            int temp = 0;
//            int step = fu;//最大的负数
            for (int j = 0; j < fu; j++) {
                if (temp != nums[j]) {
                    temp = nums[j];
                    if (nums[i] + nums[j] + nums[fu] >= 0 && nums[i] + nums[j] + nums[j + 1] <= 0) {

                        for (int k = fu; k > j; k--) {
                            if (nums[i] + nums[j] + nums[k] == 0) {
//                                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                                set.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                                step = k;
                                break;
                            }
                        }

                    }
                }

            }
        }


        //负正正
        for (int i = 0; i <= fu; i++) {
            int temp = 0;
//            int step = len;
            for (int j = zh; j < len; j++) {
                if (temp != nums[j]) {
                    temp = nums[j];
                    if (nums[i] + nums[j] + nums[j + 1] <= 0 && nums[i] + nums[j] + nums[len] >= 0) {

                        for (int k = len; k > j; k--) {
                            if (nums[i] + nums[j] + nums[k] == 0) {
//                                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                                set.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                                step = k;
                                break;
                            }
                        }

                    }
                }
            }
        }
//        for (List item:set){
//            res.add(item);
//        }
        res.addAll(set);
        return res;
    }

    public static void main(String[] args) {
        LeetCode0018 demo = new LeetCode0018();
        System.out.println(demo.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}).toString());
        System.out.println(demo.threeSum(new int[]{-2,0,0,2,2}).toString());
    }
}
