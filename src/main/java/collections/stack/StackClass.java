package collections.stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);

        //pop() - извлекаем последний элемент
        // System.out.println(stack.pop());//1
        //System.out.println(stack.pop());//4
        //System.out.println(stack.pop());//2
        //System.out.println(stack.pop());//java.util.EmptyStackException
        //peek() - просто возвращает последний элемент
        //System.out.println(stack.peek());//4
        //System.out.println(stack.peek());//4

        while (!stack.empty()) {
            System.out.println(stack.pop());//1 4 2
        }
    }
}
