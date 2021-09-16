package org.zuo._1_getMin功能栈;

import java.util.Stack;

/**
 * TODO
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/9/16
 **/
public class 压入慢弹出快 {

    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(Integer element) {
        stackData.push(element);
        if (stackMin.isEmpty()) {
            stackMin.push(element);
            return;
        }

        Integer min = stackMin.peek();
        if (element <= min) {
            stackMin.push(element);
        } else {
            stackMin.push(min);
        }
    }

    public Integer pop() {
        Integer pop = stackData.pop();
        stackMin.pop();
        return pop;
    }

    public Integer getMin() {
        return stackMin.peek();
    }

    public static void main(String[] args) {
        压入慢弹出快 stack = new 压入慢弹出快();

        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(1);

        assert 1 == stack.pop();
        assert 1 == stack.getMin();
        assert 2 == stack.pop();
        assert 1 == stack.getMin();
        assert 1 == stack.pop();
        assert 3 == stack.getMin();
    }
}
