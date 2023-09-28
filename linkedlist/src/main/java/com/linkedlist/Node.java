package com.linkedlist;

public class Node<T> {

    private T value;
    private Node nextNode;

    public Node() {
        this.nextNode = null;
    }

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }

    public String toStringLinked() {
        String str = "Node [value=" + value + "]";

        if (nextNode != null) {
            str += " -- " + nextNode.toString();
        }

        return str;
    }
}
