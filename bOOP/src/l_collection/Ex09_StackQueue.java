package l_collection;

import java.util.Stack;

/*
    스택과 큐

    - 스택(LIFO)    : Last In First Out
    - 큐(FIFO)      : First In First Out
*/

public class Ex09_StackQueue {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
