package com.company;

public class LinkedList<T> {
    private INode<T> head;
    private INode<T> tail;
    private int size;

    LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    void add(T item) {
        INode<T> newNode = new MyNode<>(item);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    void append(T item) {
        INode<T> newNode = new MyNode<>(item);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.setNext(newNode);
        tail = newNode;
    }

    void remove() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }

    int size() {
        return size;
    }

    T returnHead() {
        return head == null ? null : head.getKey();
    }

    @Override
    public String toString() {
        String data="[";
        if(head==null){
            return "[]";
        }
        INode<T> tempNode= head;
        while (tempNode.getNext()!=null){
            data+=tempNode.getKey()+",";
            tempNode=tempNode.getNext();
        }
        data+=tempNode.getKey()+"]";
        return data;
    }
}
