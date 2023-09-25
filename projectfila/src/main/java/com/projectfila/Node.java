package com.projectfila;

public class Node {

    private Object obj;
    private Node refNode;

    public Node(Object obj) {
        this.refNode = null;
        this.obj = obj;
    }

    public Node() {
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
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
