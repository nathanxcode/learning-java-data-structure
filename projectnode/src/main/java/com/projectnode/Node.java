package com.projectnode;

/**
 * Hello world!
 *
 */
public class Node<T> {

    private T value;
    private Node<T> nextNode;

    public Node(T value) {
        this.nextNode = null;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

}
