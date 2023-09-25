package com.projectfila;

public class Fila {
    private Node nodeRef;

    public Fila() {
        this.nodeRef = null;
    }

    public void enqueue(Node newNode) {
        newNode.setRefNode(nodeRef);
        nodeRef = newNode;
    }

    public Node first() {
        if (!this.isEmpty()) {
            Node firstNode = nodeRef;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public Node dequeue() {
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
            return firstNode;
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