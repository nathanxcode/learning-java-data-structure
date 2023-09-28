package com.linkedlist;

public class LinkedList<T> {

    Node<T> nodeRef;

    public LinkedList() {
        this.nodeRef = null;
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
