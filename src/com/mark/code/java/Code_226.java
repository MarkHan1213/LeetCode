package com.mark.code.java;

/**
 * 翻转一棵二叉树。
 */
public class Code_226 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        //先将根节点下面的子节点互换
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        //将根节点的左节点当做下一次递归的根节点继续互相交换
        if (root.left != null) {
            invertTree(root.left);
        }
        //将根节点的右节点当做下一次递归的根节点继续互相交换
        if (root.right != null) {
            invertTree(root.right);
        }
        return root;
    }

}
