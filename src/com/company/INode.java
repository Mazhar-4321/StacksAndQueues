package com.company;

public interface INode<T> {
    void setKey(T key);
    T getKey();
    void setNext(INode<T> next);
    INode<T> getNext();
}
