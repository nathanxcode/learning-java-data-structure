package com.projectfila;

public class Node<T> {

    private T obj;
    private Node<T> refNode;

    public Node(T obj) {
        this.refNode = null;
        this.obj = obj;
    }

    public Node() {
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node node) {
        this.refNode = node;
    }

    @Override
    public String toString() {
        return "Node [obj=" + obj + ", node=" + refNode + "]";
    }

}
