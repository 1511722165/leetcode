package leetcode.leetcode3001_4000.leetcode3101_3200.leetcode3161_3170;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode3164 {

    public long numberOfPairs1(int[] nums1, int[] nums2, int k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int flag = 0;
        long res = 0l, a = 0l, b = 0l;
        for (int i = 0; i < nums2.length; ) {
            nums2[i] *= k;
            if (nums2[i] == a) {
                i++;
                res += b;
            } else {
                a = nums2[i];
                b = 0;
                int c = 0;
                for (int j = flag; j < nums1.length; j++) {
                    if (nums2[i] <= nums1[j]) {
                        if (nums1[j] % nums2[i] == 0) {
                            b++;
                        }
                    } else {
                        flag++;
                    }
                }
                i++;
                res += b;
            }
        }
        return res;
    }

    public long numberOfPairs2(int[] nums1, int[] nums2, int k) {
        Arrays.sort(nums2);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % k == 0) {
                if (map.containsKey(nums1[i])) {
                    map.put(nums1[i], map.get(nums1[i]) + 1);
                } else {
                    map.put(nums1[i], 1);
                }
            }
        }
        long res = 0l, a = 0l, b = 0l;
        for (int i = 0; i < nums2.length; ) {
            nums2[i] *= k;
            if (nums2[i] == a) {
                i++;
                res += b;
            } else {
                a = nums2[i];
                b = 0;
                for (int y : map.keySet()) {
                    if (y % nums2[i] == 0) {
                        b += map.get(y);
                    }
                }
                i++;
                res += b;
            }
        }
        return res;
    }


    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        // 枚举倍增(半暴力) +  哈希去重
        int max = 0;
        Map<Integer, Integer> m1 = new HashMap<>();
        for(int x : nums1){
            // 筛掉nums1中不能被k整除的值。
            if(x % k == 0){
                m1.put(x, m1.getOrDefault(x, 0) + 1);
                max = x > max ? x : max;
            }
        }
        Map<Integer, Integer> m2 = new HashMap<>();
        for(int x : nums2){
            m2.put(x * k, m2.getOrDefault(x * k, 0) + 1);
        }
        long ans = 0;
        for(int y : m2.keySet()){
            int cnt2 = m2.get(y);
            int cnt1 = 0;
            // 核心：将m1中的最大值max作为倍增极限，而非每次倍增至1e9(超时)。
            for(int x = y; x <= max; x += y){
                cnt1 += m1.getOrDefault(x, 0);
            }
            ans += (long)cnt1 * cnt2;
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode3164 demo = new LeetCode3164();
        System.out.println(demo.numberOfPairs(new int[]{1,3,4}, new int[]{1,3,4}, 1));
    }
}
