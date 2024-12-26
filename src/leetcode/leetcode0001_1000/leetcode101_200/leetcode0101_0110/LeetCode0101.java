package leetcode.leetcode0001_1000.leetcode101_200.leetcode0101_0110;

public class LeetCode0101 {

    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right, true);
    }

    public boolean dfs(TreeNode p, TreeNode q, boolean flag) {
        if (p == null && q != null) flag = false;
        if (p != null && q == null) flag = false;
        if (p != null && q != null) {
            if (p.val != q.val) flag = false;
            if (flag) {
                flag = dfs(p.left, q.right, flag);
                flag = dfs(p.right, q.left, flag);
            } else {
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