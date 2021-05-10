package leetcode.leetcode0001_1000.leetcode801_900.leetcode0871_0880;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sb1=new ArrayList<Integer>();
        List<Integer> sb2=new ArrayList<Integer>();
        findLeftRight(sb1,root1);
        findLeftRight(sb2,root2);
        if(sb1.size()!=sb2.size()) return false;
        for(int i=0;i<sb1.size();i++){
            if(sb1.get(i)!=sb2.get(i)) return false;
        }
        return true;
    }
private void findLeftRight(List sb, TreeNode root){
        if(root.left==null&&root.right==null){
            sb.add(root.val);
        }
        if(root.left!=null){
            findLeftRight(sb,root.left);
        }
        if(root.right!=null){
        findLeftRight(sb,root.right);
         }
}

    public static void main(String[] args) {
        LeetCode0872 demo =new LeetCode0872();
        TreeNode tree1=new TreeNode(1) ;
        TreeNode tree2=new TreeNode(1) ;
        demo.leafSimilar(tree1,tree2);
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

