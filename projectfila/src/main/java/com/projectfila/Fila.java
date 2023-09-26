package com.projectfila;

public class Fila<T> {
    private Node<T> nodeRef;

    public Fila() {
        this.nodeRef = null;
    }

    public void enqueue(T obj) {
        Node newNode = new Node(obj);
        newNode.setRefNode(nodeRef);
        nodeRef = newNode;
    }

    public T first() {
        if (!this.isEmpty()) {
            Node firstNode = nodeRef;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }
            return (T) firstNode.getObj();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Node firstNode = nodeRef;
            Node tempNode = nodeRef;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    tempNode = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    tempNode.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObj();
        }
        return null;
    }

    public boolean isEmpty() {
        return nodeRef == null ? true : false;
    }

    @Override
    public String toString() {

        String stringReturn = "";
        Node refNode = nodeRef;
        if (nodeRef != null) {
            while (true) {
                stringReturn += "Node[object=" + refNode.getObj() + "] -> ";
                if (refNode.getRefNode() != null) {
                    refNode = refNode.getRefNode();
                } else {
                    break;
                }
            }
        }

        return stringReturn;

    }

}