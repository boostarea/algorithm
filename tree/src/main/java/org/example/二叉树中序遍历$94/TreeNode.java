package org.example.二叉树中序遍历$94;

/**
 * Definition for a binary tree node.
 * @author chenrong
 * @version 1.0
 * @since 2021/5/12
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode init() {
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t4 = new TreeNode(4, null, null);
        TreeNode t3 = new TreeNode(3, null, t4);
        TreeNode t2 = new TreeNode(2, t1, t3);
        return t2;
    }
}