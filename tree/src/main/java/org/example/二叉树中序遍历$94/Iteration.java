package org.example.二叉树中序遍历$94;

import org.example.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 迭代：模拟栈
 * @author chenrong
 * @version 1.0
 * @since 2021/5/13
 **/
public class Iteration {

    public List<Integer> iterate(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<>();

        while (null != root || !stk.isEmpty()) {
            while (null != root) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.init();
        List<Integer> res = new Iteration().iterate(root);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }

}
