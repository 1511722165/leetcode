package leetcode.leetcode1001_2000.leetcode1001_1100.leetcode1041_1050;


import leetcode.util.TreeNode;

public class LeetCode1045 {

    public static int top = 0;
    public static int left = 0;
    public static int right = 0;

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        top=0;left=0; right=0;
        this.left(x, root);
        if (top > left + right + 1 || left > right + top + 1 || right > top + left + 1) {
            return true;
        }
        return false;
    }


    public void left(int x, TreeNode node) {
        if (node == null) {
            return;
        }
        if (x > 0 && node.getVal() != x) {
            //计算向上
            top++;
            this.left(x, node.getLeft());
            this.right(x, node.getRight());
        } else if (node.getVal() == x) {
            //计算向左下右下
            this.left(-1, node.getLeft());
            this.right(0, node.getRight());
        } else if (x == 0) {
            //计算向左下右下
            left++;
            this.left(x, node.getLeft());
            this.right(x, node.getRight());
        } else if (x == -1) {
            //计算向左下右下
            right++;
            this.left(x, node.getLeft());
            this.right(x, node.getRight());
        }

    }

    public void right(int x, TreeNode node) {
        if (node == null) {
            return;
        }
        if (x > 0 && node.getVal() != x) {
            //计算向上
            top++;
            this.left(x, node.getLeft());
            this.right(x, node.getRight());
        } else if (node.getVal() == x) {
            //计算向左下右下
            this.left(-1, node.getLeft());
            this.right(0, node.getRight());
        } else if (x == 0) {
            //计算向左下右下
            left++;
            this.left(x, node.getLeft());
            this.right(x, node.getRight());
        } else if (x == -1) {
            //计算向左下右下
            right++;
            this.left(x, node.getLeft());
            this.right(x, node.getRight());
        }

    }

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(2);

        TreeNode node2 = new TreeNode(3);

        TreeNode node3 = new TreeNode(1, node1, node2);
        LeetCode1045 demo = new LeetCode1045();
        demo.btreeGameWinningMove(node3, 3, 1);

    }

}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
//    public static int top=0;
//    public static int left=0;
//    public static int right=0;
//    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
//        top=0;left=0; right=0;
//        this.left(x, root);
//        if (top > left + right + 1 || left > right + top + 1 || right > top + left + 1) {
//            return true;
//        }
//        return false;
//    }
//
//
//    public void left( int x, TreeNode node) {
//        if(node==null){
//            return;
//        }
//        if (x>0&&node.val != x) {
//            //计算向上
//            top++;
//            this.left(x, node.left);
//            this.right( x, node.right);
//        }
//        if(node.val == x){
//            //计算向左下右下
//            this.left( -1, node.left);
//            this.right( 0, node.right);
//        }
//        if(x == 0){
//            //计算向左下右下
//            left ++;
//            this.left( x, node.left);
//            this.right( x, node.right);
//        }
//        if(x == -1){
//            //计算向左下右下
//            right ++;
//            this.left( x, node.left);
//            this.right( x, node.right);
//        }
//
//    }
//
//    public void right( int x, TreeNode node) {
//        if(node==null){
//            return;
//        }
//        if (x>0&&node.val != x) {
//            //计算向上
//            top++;
//            this.left( x, node.left);
//            this.right( x, node.right);
//        }
//        if(node.val == x){
//            //计算向左下右下
//            this.left(-1, node.left);
//            this.right( 0, node.right);
//        }
//        if(x == 0){
//            //计算向左下右下
//            left ++;
//            this.left( x, node.left);
//            this.right( x, node.right);
//        }
//
//        if(x == -1){
//            //计算向左下右下
//            right ++;
//            this.left( x, node.left);
//            this.right( x, node.right);
//        }
//
//    }
//}