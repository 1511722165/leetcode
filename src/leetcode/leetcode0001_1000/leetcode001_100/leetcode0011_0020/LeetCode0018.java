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

    public List<List<Integer>> fourSum1(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();
        Set<Integer> third = new HashSet<>();

        for(int a = 0; a < nums.length-3; a++){
            if(!first.contains(nums[a])){
                first.add(nums[a]);
                for(int b = a+1; b < nums.length-2; b++){
                    if(!second.contains(nums[b])){
                        second.add(nums[b]);
                        for(int c = b+1; c < nums.length-1; c++){
                            if(!third.contains(nums[c])){
                                third.add(nums[c]);
                                long sum = 0l+nums[a]+nums[b]+nums[c];
                                for(int d = c+1; d < nums.length; d++){
                                    System.out.println(sum+nums[d]);
                                    if(sum+nums[d] > target){
                                        break;
                                    }else if(sum+nums[d] == target){
                                        List<Integer> combine = new ArrayList<>(4);
                                        combine.add(nums[a]);
                                        combine.add(nums[b]);
                                        combine.add(nums[c]);
                                        combine.add(nums[d]);
                                        result.add(combine);
                                        break;
                                    }
                                }
                            }
                        }
                        third.clear();
                    }
                }
                second.clear();
            }
        }
        return result;
    }



    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }

        Arrays.sort(nums);
        int n = nums.length;

        // 转换为long避免溢出
        long longTarget = target;

        for (int i = 0; i < n - 3; i++) {
            // 跳过重复元素
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 剪枝：当前最小和大于target，后面更大，直接结束
            long minSum = (long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if (minSum > longTarget) break;

            // 剪枝：当前最大和小于target，当前数太小，继续下一个
            long maxSum = (long)nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1];
            if (maxSum < longTarget) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // 跳过重复元素
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 第二层剪枝
                long minSum2 = (long)nums[i] + nums[j] + nums[j + 1] + nums[j + 2];
                if (minSum2 > longTarget) break;

                long maxSum2 = (long)nums[i] + nums[j] + nums[n - 2] + nums[n - 1];
                if (maxSum2 < longTarget) continue;

                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < longTarget) {
                        left++;
                        // 优化：跳过重复元素
                        while (left < right && nums[left] == nums[left - 1]) left++;
                    } else if (sum > longTarget) {
                        right--;
                        // 优化：跳过重复元素
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        // 跳过重复元素
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode0018 demo = new LeetCode0018();
//        System.out.println(demo.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}).toString());
//        System.out.println(demo.threeSum(new int[]{-2,0,0,2,2}).toString());

//        System.out.println(demo.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296));

    }
}
