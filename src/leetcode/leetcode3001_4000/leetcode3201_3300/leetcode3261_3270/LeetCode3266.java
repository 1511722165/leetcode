package leetcode.leetcode3001_4000.leetcode3201_3300.leetcode3261_3270;

import java.util.*;

public class LeetCode3266 {

    public int[] getFinalState(int[] nums, int k, int m) {
        if (m == 1) {
            return nums;
        }
        int length = nums.length;
        Node[] nodes = new Node[length];
        int max = 0;
        for (int i = 0; i < length; i++) {
            nodes[i] = new Node(nums[i], i);
            max = Math.max(max, nums[i]);
        }
        int v = getList(nodes, k, m, max);
        if (v == k) {
            for (Node node : nodes) {
                nums[node.index] = (int) (node.value % 1000000007);
            }
            return nums;
        }
        k -= v;
        int t1 = k / length;
        int t2 = k % length;
        getList(nodes, t2, m);

        int mm = mm(m, t1);
//        System.out.println(v + "  " + t1 + "  " + t2 + "  " + mm);
        for (Node node : nodes) {
            nums[node.index] = (int) (node.value * mm % 1000000007);
        }
        return nums;
    }

    public int mm(int m, int t1) {
        long item = m;
        long sum = 1;
        while (t1 != 0) {
            if ((t1 & 1) == 1) {
                sum = sum * item % 1000000007;
            }
            item = item * item % 1000000007;
            t1 >>= 1;
        }
        return (int) sum;
    }

    private int getList(Node[] nodes, int k, int m, int max) {
        int count = 0;
        PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> a.value == b.value ? Integer.compare(a.index, b.index) : Long.compare(a.value, b.value));
        Collections.addAll(queue, nodes);
        while (queue.peek().value * m <= max) {
            Node poll = queue.poll();
            poll.value = poll.value * m ;
            queue.add(poll);
            count++;
            if (count == k) {
                break;
            }
        }
        return count;
    }

    private void getList(Node[] nodes, int k, int m) {
        int count = 0;
        PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> a.value == b.value ? Integer.compare(a.index, b.index) : Long.compare(a.value, b.value));
        Collections.addAll(queue, nodes);
        while (count < k) {
            Node poll = queue.poll();
            poll.value = poll.value * m ;
            queue.add(poll);
            count++;
        }
        for (Node node : nodes) {
            node.value = node.value % 1000000007;
        }
    }

    private static class Node {
        private long value;
        private int index;

        public Node(long value, int index) {
            this.value = value;
            this.index = index;
        }
    }



    public static void main(String[] args) {
        LeetCode3266 demo = new LeetCode3266();
        System.out.println(Arrays.toString(demo.getFinalState(new int[]{66307295, 441787703, 589039035, 322281864}, 900900704, 641725)));

//        System.out.println(Arrays.toString(demo.getFinalState1(new int[]{1}, 3, 10)));
    }

    private static final int MOD = 1_000_000_007;

    public int[] getFinalState1(int[] nums, int k, int multiplier) {
        if (multiplier == 1) return nums;
        long[][] dp=new long[nums.length][2];
        List list =new ArrayList();
        int flag = 0, cycle = 0;
        while (flag < nums.length) {
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (dp[j][0] <= dp[i][0] && nums[j] < nums[i]) {
                    i = j;
                }
            }
            long sum = 1l * nums[i] * multiplier;
            if (dp[i][0] == 0) {
                flag++;
            }
            dp[i][0] += sum / MOD;
            nums[i] = (int) (sum % MOD);
            list.add(i);
            dp[i][1]++;
            cycle++;
        }
        int yu = k-cycle % nums.length;
        int shang = ((k-yu-cycle) / nums.length) ;
        long mul=1l;
        while (shang > 0) {
            mul=multiplier*mul%MOD;
            shang--;
        }
        if(mul!=1){
            for (int j=0;j<nums.length;j++){
                while (dp[j][1]>0){
                    long res=nums[j] * mul%MOD;
                    res=res*multiplier%MOD;
                    nums[j] = (int)res%MOD;
                    dp[j][1]--;
                }
            }
        }
        int index=0;
        while (index<yu){
            long sum = 1l * nums[(int) list.get(index)] * multiplier;
            nums[(int) list.get(index)] = (int) (sum % MOD);
            index++;
        }

        return nums;
    }

}
