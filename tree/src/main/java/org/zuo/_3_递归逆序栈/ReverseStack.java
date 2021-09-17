package org.zuo._3_递归逆序栈;

import java.util.Stack;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/9/17
 **/
public class ReverseStack {

    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        Integer res = stack.pop();
        if (stack.isEmpty()) {
            return res;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(res);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);

        reverse(stack);
        stack.forEach(System.out::println);
    }
}
