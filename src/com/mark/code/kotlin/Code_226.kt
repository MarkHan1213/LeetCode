package com.mark.code.kotlin

/**
 * 翻转一棵二叉树。
 */
class Code_226 {

    inner class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        //先将根节点下面的子节点互换
        val node = root.left
        root.left = root.right
        root.right = node
        //将根节点的左节点当做下一次递归的根节点继续互相交换
        if (root.left != null) {
            invertTree(root.left)
        }
        //将根节点的右节点当做下一次递归的根节点继续互相交换
        if (root.right != null) {
            invertTree(root.right)
        }
        return root
    }

}
