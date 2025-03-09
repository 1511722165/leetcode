package leetcode.leetcode2001_3000.leetcode2001_2100.leetcode2061_2070;

import java.util.Arrays;

public class LeetCode2070 {


    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int k = 0;
        for (int i = 1; i < items.length; i++) {
            if (items[i][0] == items[k][0]) {
                if (items[i][1] > items[k][1]) {
                    items[k] = items[i];
                }
            } else {
                if (items[i][1] > items[k][1]) {
                    items[++k] = items[i];
                }
            }

        }
        for (int i = 0; i < queries.length; i++) {
            int j = fun(items, queries[i], k + 1);
            queries[i] = j >=0 ? items[j-1][1] : 0;
        }
        return queries;
    }

    public int fun(int[][] items, int target, int right) {
        int left = 0;
        if(target<items[left][0])return -1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (items[left][0] == target) {
                return left+1;
            } else if (items[right-1][0] == target) {
                return right;
            }else if (items[mid][0] == target) {
                return mid+1;
            }  else if (items[mid][0] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        LeetCode2070 demo = new LeetCode2070();
//        demo.maximumBeauty(new int[][]{{1,2},{3,2},{2,4},{5,6},{3,5}},new int[]{1,2,3,4,5,6});
        demo.maximumBeauty(new int[][]{{1, 2}, {1, 2}, {1, 3}, {1,4}}, new int[]{1});
//        demo.maximumBeauty(new int[][]{{10, 10000}}, new int[]{5});
//        demo.maximumBeauty(new int[][]{{1, 2}}, new int[]{1,2});
    }

}
