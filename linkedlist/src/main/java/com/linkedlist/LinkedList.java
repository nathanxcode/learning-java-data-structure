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

    public T get(int index) {
        return getNode(index).getValue();
    }

    public T remove(int index) {

        Node<T> removeNode = getNode(index);
        if (index == 0) {
            nodeRef = removeNode.getNextNode();
            return removeNode.getValue();
        }

        Node<T> prevNode = getNode(index - 1);
        prevNode.setNextNode(removeNode.getNextNode());
        return removeNode.getValue();

    }

    private Node<T> getNode(int index) {
        validateIndex(index);
        Node<T> tempNode = nodeRef;
        Node<T> returnNode = null;
        for (int i = 0; i < this.size() - 1; i++) {
            returnNode = tempNode;
            tempNode = tempNode.getNextNode();
        }

        return returnNode;
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

    private void validateIndex(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Index not exists");
        }
    }

    public boolean isEmpty() {
        return nodeRef == null ? true : false;
    }

    @Override
    public String toString() {

        String strReturn = "";
        Node<T> tempNode = nodeRef;
        for (int i = 0; i < this.size() - 1; i++) {
            strReturn += "[value=" + tempNode.getValue() + "] -> ";
            tempNode = tempNode.getNextNode();
        }

        strReturn += "null";

        return strReturn;

    }

}
