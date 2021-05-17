package org.example.二叉树中序遍历$94;

import org.example.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/5/14
 **/
public class ColorTag {

    public List<Integer> inorderTraversal(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if (null == root) {
            return list;
        }
        stack.push(root);
        map.put(root, 1);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            //如果是第一次访问的话，则将其右子节点，自身，左子结点入栈
            if (1 == map.get(node)) {
                //将右子节点入栈
                if (null != node.right) {
                    stack.push(node.right);
                    map.put(node.right, 1);
                }
                stack.push(node);
                map.put(node, 2);

                if (null != node.left) {
                    stack.push(node.left);
                    map.put(node.left, 1);
                }
            //表示是第2次访问，就输出
            } else {
                list.add(node.val);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.init();
        List<Integer> res = new ColorTag().inorderTraversal(root);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
