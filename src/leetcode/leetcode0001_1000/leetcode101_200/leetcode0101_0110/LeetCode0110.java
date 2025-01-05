package leetcode.leetcode0001_1000.leetcode101_200.leetcode0101_0110;

public class LeetCode0110 {

    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;

        if(dfs(root,0)< 0)
            return false;return true;

    }


    public int dfs(TreeNode p , int count) {
        if(p==null||count==-1){
            return count;
        }
        count++;
        int left =dfs(p.left,count);
        int right=dfs(p.right,count);
        if(Math.abs(right-left)>1){
            return -1;
        }
        return Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode root1=new TreeNode(4);
        TreeNode root2=new TreeNode(4);
        TreeNode root3=new TreeNode(3,root1,root2);
        TreeNode root4=new TreeNode(3);

        TreeNode root5=new TreeNode(4);
        TreeNode root6=new TreeNode(4);
        TreeNode root7=new TreeNode(3,root1,root2);
        TreeNode root8=new TreeNode(3);

        TreeNode root=new TreeNode(3,root3,root4);
        LeetCode0110 leetCode0110=new LeetCode0110();
        leetCode0110.isBalanced(root);
    }
}
