package leetcode.leetcode0001_1000.leetcode101_200.leetcode0101_0110;


import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<TreeNode> list=new ArrayList<>();
        TreeNode treeNode=new TreeNode();
        for(int i=0;i<preorder.length;i++){
            TreeNode node=new TreeNode(inorder[i]);




            list.add(node);
        }



        return treeNode;
    }
}
