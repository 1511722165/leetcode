package leetcode.leetcode3001_4000.leetcode3301_3400.leetcode3301_3310;

public class LeetCode3305 {

    //'a'、'e'、'i'、'o'、'u'
    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        int ret = 0;
        int[] nums = new int[6];
        int left = 0, right = 0;
        while(left != n) {
            //right
            while(right != n && !isYuanOk(nums)) {
                ++nums[getIndex(word.charAt(right++))];
            }
            if(right == n) {
                if(!isYuanOk(nums)) return ret;
                if(nums[5] < k) return ret;
                while(nums[5] != k) {
                    --nums[getIndex(word.charAt(left++))];
                }
                if(!isYuanOk(nums)) return ret;
                while(left<n && nums[5] == k && isYuanOk(nums)) {
                    ret++;
                    --nums[getIndex(word.charAt(left++))];
                }
                return ret;
            }
            if(nums[5] < k) {
                while(right != n && nums[5] < k){
                    ++nums[getIndex(word.charAt(right++))];
                }
            } else if(nums[5] == k) {
                ret++;
                for(int temp = right; temp < n && (word.charAt(temp)=='a' ||word.charAt(temp)=='e' ||word.charAt(temp)=='i' ||word.charAt(temp)=='o' ||word.charAt(temp)=='u'); ++temp,++ret);
                --nums[getIndex(word.charAt(left++))];
            } else if(nums[5] > k) {
                --nums[getIndex(word.charAt(left++))];
            }
        }
        return ret;
    }
    public boolean isYuanOk(int[] nums) {
        return nums[0]!=0 && nums[1]!=0 && nums[2]!=0 && nums[3]!=0 && nums[4]!=0;
    }
    public int getIndex(char c) {
        switch(c) {
            case 'a': return 0;
            case 'e': return 1;
            case 'i': return 2;
            case 'o': return 3;
            case 'u': return 4;
            default: return 5;
        }
    }
    public static void main(String[] args) {
        System.out.println((char) 'a' - 'a');
        System.out.println((char) 'e' - 'a');
        System.out.println((char) 'i' - 'a');
        System.out.println((char) 'o' - 'a');
        System.out.println((char) 'u' - 'a');
    }

}
