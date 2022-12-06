package com.company;

public class Queue<T> {
    private LinkedList<T> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    public void enqueue(T element) {
        linkedList.append(element);
    }

    public T dequeue() {
        T head = linkedList.returnHead();
        linkedList.remove();
        return head;
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    public int size() {
        return linkedList.size();
    }

    @Override
    public String toString() {
        String data = linkedList.toString();
        return data;
    }
}
