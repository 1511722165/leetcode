package leetcode.leetcode0001_1000.leetcode701_800.leetcode0781_0790;

public class LeetCode0783 {
    public int minDiffInBST(TreeNode root) {
        int res = 100000;
        res=findMin(root, res);
        return res;
    }
    public int findMin(TreeNode root,int res){
        if(root.left!=null&&root.right!=null){
            res=Math.min(res,Math.abs(root.val-root.right.val));
            res=Math.min(res,Math.abs(root.val-root.left.val));
            res=findMin(root.right,res);
            res=findMin(root.left,res);
        }else if(root.left!=null&&root.right==null){
            res=Math.min(res,Math.abs(root.val-root.left.val));
            res=findMin(root.left,res);
        }else if(root.left==null&&root.right!=null){
            res=Math.min(res,Math.abs(root.val-root.right.val));
            res=findMin(root.right,res);
        }
        return res;
}


    public static void main(String[] args) {
        LeetCode0783 demo=new LeetCode0783();
        TreeNode n3=new TreeNode(6);
        TreeNode n4=new TreeNode(3);
        TreeNode n5=new TreeNode(1);
        TreeNode n2=new TreeNode(2,n5,n4);
        TreeNode n1=new TreeNode(4,n2,n3);
        demo.minDiffInBST(n1);


    }
}
  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
       this.right = right;
      }



  }