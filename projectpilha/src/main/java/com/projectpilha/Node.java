package com.projectpilha;

public class Node {

    private int value;
    private Node node = null;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String toString() {
        return "Node [" + value + "]";
    }

}
