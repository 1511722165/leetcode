package leetcode.leetcode0001_1000.leetcode101_200.leetcode0101_0110;

public class LeetCode0104 {
    public int maxDepth(TreeNode root) {

        return dfs(root , 0,0);
    }

    public int dfs(TreeNode p , int count,int max) {
        if(p==null){
            return count;
        }
        count++;
        max=Math.max(count,max);
        if(p.right!=null){
            max =Math.max(dfs(p.right, count,max),max);
        }
        if (p.left!=null){
            max =Math.max(dfs(p.left,  count,max),max);
        }
        return max;
    }


    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode(3);
        TreeNode treeNode2=new TreeNode(4);
        TreeNode treeNode3=new TreeNode(5);
        TreeNode treeNode4=new TreeNode(2,treeNode2,treeNode3);
        TreeNode root=new TreeNode(1,treeNode1,treeNode4);
        LeetCode0104 demo=new LeetCode0104();
        System.out.println(demo.maxDepth(root));;
    }
}

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}