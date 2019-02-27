package com.mark.code.java;

/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * <p>
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 */
public class Code_617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //若t1的没有,就返回t2的
        if (t1 == null) return t2;
        //若t2的没有,就返回t1的
        if (t2 == null) return t1;
        //先合并根节点
        t1.val += t2.val;
        //左节点跟左节点合并
        t1.left = mergeTrees(t1.left, t2.left);
        //右节点和右节点合并
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
