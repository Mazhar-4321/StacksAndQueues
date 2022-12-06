package com.company;

public class Stack<T> {
    private LinkedList<T> linkedList;

    Stack() {
        linkedList = new LinkedList<>();
    }

    void push(T item) {
        linkedList.add(item);
    }

    T pop() {
        T head = linkedList.returnHead();
        linkedList.remove();
        return head;
    }

    int size() {
        return linkedList.size();
    }

    T peek() {
        return linkedList.returnHead();
    }

    boolean isEmpty() {
        return linkedList.size() == 0;
    }

    @Override
    public String toString() {
        String data=linkedList.toString();
        return data;
    }
}
