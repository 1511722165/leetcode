package leetcode.leetcode1001_2000.leetcode1101_1200.leetcode1191_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            int abs = Math.abs(arr[0] - arr[1]);
            for (int i = 1; i < arr.length - 1; i++) {
                abs = Math.min(abs, Math.abs(arr[i] - arr[i + 1]));
            }
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < arr.length - 1; i++) {
                if (abs == Math.abs(arr[i] - arr[i + 1])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[i + 1]);
                    result.add(list);
                }
            }
            return result;
        }

    public static void main(String[] args) {
        LeetCode1200 demo= new LeetCode1200();
        int arr[]={4,2,1,3};
        demo.minimumAbsDifference(arr);
    }
}
