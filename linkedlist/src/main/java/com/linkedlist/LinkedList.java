package com.linkedlist;

public class LinkedList<T> {

    Node<T> nodeRef;

    public LinkedList() {
        this.nodeRef = null;
    }

    public void add(T value) {

        Node<T> newNode = new Node<>(value);
        if (this.isEmpty()) {
            nodeRef = newNode;
            return;
        }

        Node<T> tempNode = nodeRef;
        for (int i = 0; i < this.size() - 1; i++) {
            tempNode = tempNode.getNextNode();
        }

        tempNode.setNextNode(newNode);

    }

    public int size() {
        int listSize = 0;
        Node<T> tempNode = nodeRef;
        while (true) {
            if (tempNode != null) {
                listSize++;
                if (tempNode.getNextNode() != null) {
                    tempNode = tempNode.getNextNode();
                } else {
                    break;
                }

            } else {
                break;
            }
        }
        return listSize;
    }

    public boolean isEmpty() {
        return nodeRef == null ? true : false;
    }

}
