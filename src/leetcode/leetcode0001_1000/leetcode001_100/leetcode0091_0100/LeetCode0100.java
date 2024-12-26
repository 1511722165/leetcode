package leetcode.leetcode0001_1000.leetcode001_100.leetcode0091_0100;

public class LeetCode0100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q,true);
    }


    public boolean dfs(TreeNode p, TreeNode q,boolean flag) {
        if(p==null&&q!=null) flag= false;
        if(p!=null&&q==null) flag =false;
        if(p!=null&&q!=null){
            if(p.val!=q.val) flag =false;
            if(flag){
                flag=dfs(p.left,q.left,flag);
                flag=dfs(p.right,q.right,flag);
            }else {
                return flag;
            }
        }
        return flag;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
