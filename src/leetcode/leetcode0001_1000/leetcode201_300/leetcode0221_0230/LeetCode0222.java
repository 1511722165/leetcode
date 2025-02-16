package leetcode.leetcode0001_1000.leetcode201_300.leetcode0221_0230;


public class LeetCode0222 {


    public int countNodes(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else if (treeNode.left == null && treeNode.right == null) {
            return 1;
        } else if (treeNode.left != null && treeNode.right == null) {
            return 1 + countNodes(treeNode.left);
        } else if (treeNode.left == null && treeNode.right != null) {

            return 1 + countNodes(treeNode.right);
        } else {
            return 1 + countNodes(treeNode.right) + countNodes(treeNode.left);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}