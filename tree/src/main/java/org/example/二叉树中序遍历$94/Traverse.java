package org.example.二叉树中序遍历$94;

import org.example.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/12
 **/
public class Traverse {

    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        s(root);
        return res;
    }

    private void s(TreeNode root) {
        if(null == root) {
            return;
        }
        s(root.left);
        res.add(root.val);
        s(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.init();
        List<Integer> res = new Traverse().inorderTraversal(root);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
