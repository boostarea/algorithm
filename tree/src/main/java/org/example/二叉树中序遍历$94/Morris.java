package org.example.二叉树中序遍历$94;

import org.example.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 关键点：左子树遍历完，将最右边节点右孩子指回root
 * @author chenrong
 * @version 1.0
 * @since 2021/5/14
 **/
public class Morris {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode predecessor = null;

        while (null != root) {
            if (null != root.left) {
                // predecessor 节点就是当前 root 节点向左走一步，然后一直向右走至无法走为止
                predecessor = root.left;
                while (null != predecessor.right && root != predecessor.right) {
                    predecessor = predecessor.right;
                }
                // 让 predecessor 的右指针指向 root，继续遍历左子树
                if (null == predecessor.right) {
                    predecessor.right = root;
                    root = root.left;
                // 说明左子树已经访问完了，我们需要断开链接
                } else {
                    res.add(root.val);
                    predecessor.right = null;
                    root = root.right;
                }
            // 如果没有左孩子，则直接访问右孩子
            } else {
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.init();
        List<Integer> res = new Morris().inorderTraversal(root);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
