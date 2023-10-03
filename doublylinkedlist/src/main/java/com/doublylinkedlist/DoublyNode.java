package com.doublylinkedlist;

public class DoublyNode<T> {

    private T content;
    private DoublyNode<T> nextNode;
    private DoublyNode<T> prevNode;

    public DoublyNode(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public DoublyNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyNode<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyNode<T> prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "DoublyNode [content=" + content + "]";
    }

}
