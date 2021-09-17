package org.zuo._4_用一个栈实现另一个栈排序;

import java.util.Stack;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/9/17
 **/
public class StackByStack {

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();

        while (!stack.isEmpty()) {
            Integer cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }

        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        sortStackByStack(stack);
        stack.forEach(System.out::println);
    }
}
