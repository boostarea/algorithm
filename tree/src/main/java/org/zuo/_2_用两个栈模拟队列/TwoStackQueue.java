package org.zuo._2_用两个栈模拟队列;

import java.util.Stack;

/**
 * 针对队列只能单个元素出列
 *
 * @author chenrong
 * @version 1.0
 * @since 2021/9/16
 **/
public class TwoStackQueue {

    private Stack<Integer> stackPush = new Stack<>();
    private Stack<Integer> stackPop = new Stack<>();

    private void transferToPop() {
        // NOTE:pop 不为空不嫩压入
        if (!stackPop.isEmpty()) {
            return;
        }
        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());   //针对队列只能单个元素出列
        }
    }

    public void add(Integer element) {
        stackPush.push(element);
        transferToPop();
    }

    public Integer poll() {
        if (stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        transferToPop();
        return stackPop.pop();
    }

    public Integer peek() {
        if (stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        transferToPop();
        return stackPop.peek();
    }

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();

        queue.add(3);
        queue.add(2);
        queue.add(1);

        assert 3 == queue.poll();
        assert 2 == queue.poll();

        queue.add(4);
        assert 1 == queue.poll();
        assert 4 == queue.poll();
    }
}
