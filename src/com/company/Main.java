package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Stack And Queues Program");
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println(stack);
        while (stack.size() != 0) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
