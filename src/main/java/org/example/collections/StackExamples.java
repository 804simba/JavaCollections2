package org.example.collections;

import java.util.Stack;

public class StackExamples {
    // pushing elements on the top of the stack
    static void stack_push(Stack<Integer> integerStack) {
        for (int i = 0; i < 5; i++) {
            integerStack.push(i);
        }
        System.out.println("Stack: " + integerStack);
    }

    // popping elements from the top of the stack.
    static void stack_pop(Stack<Integer> integerStack) {
        System.out.println("Popping operation: ");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) integerStack.pop();
            System.out.println("Stack item: " + y);
        }
    }

    static void stack_peek(Stack<Integer> integerStack) {
        Integer element = (Integer) integerStack.peek();
        System.out.println("Element at the top: " + element);
    }

    static void stack_search(Stack<Integer> integerStack, int element) {
        Integer pos = (Integer) integerStack.search(element);
        if (pos == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element is found at position: " + pos);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        stack_push(integerStack);
        stack_pop(integerStack);
        stack_push(integerStack);
        stack_peek(integerStack);
        stack_search(integerStack, 2);
        stack_search(integerStack, 6);
        integerStack.add(2, 200);
        System.out.println(integerStack);
        integerStack.addElement(20000);
        System.out.println(integerStack);
    }
}
