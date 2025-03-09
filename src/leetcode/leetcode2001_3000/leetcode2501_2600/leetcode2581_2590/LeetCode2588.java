package leetcode.leetcode2001_3000.leetcode2501_2600.leetcode2581_2590;

public class LeetCode2588 {
//    public long beautifulSubarrays(int[] nums) {
//        long res=0;
//        int len=nums.length;
//        for (int i=0;i<len;i++){
//            int temp=nums[i];
//            for (int j=i+1;j<len;j++){
//                temp=temp^nums[j];
//                if(temp==0){
//                    res++;
//                }
//            }
//        }
//        return res;
//    }
class Node {
    private final int key;
    private int val;
    private Node left;
    private Node right;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

    private static final int CAPACITY = 1 << 18;

    public long beautifulSubarrays(int[] nums) {
        Node[] table = new Node[CAPACITY];
        incr(table, 0);
        long res = 0;
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
            res += incr(table, xor);
        }
        return res;
    }

    //将哈希表table中key对应的值+1
    private int incr(Node[] table, int key) {
        int hash = key & (CAPACITY - 1);
        Node node = table[hash];
        Node parent = null;
        while (node != null) {
            if (node.key == key) {
                return node.val++;
            }
            parent = node;
            if (node.key > key) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        if (parent == null) {
            table[hash] = new Node(key, 1);
        } else if (parent.key > key) {
            parent.left = new Node(key, 1);
        } else {
            parent.right = new Node(key, 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        LeetCode2588 demo =new LeetCode2588();
        demo.beautifulSubarrays(new int[]{4,3,1,2,4});
    }
}
