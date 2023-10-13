package com.doublylinkedlist;

public class DoublyLinkedList<T> {

    private DoublyNode<T> firstNode;
    private DoublyNode<T> lastNode;

    private int listSize;

    public DoublyLinkedList() {
        this.listSize = 0;
        this.firstNode = null;
        this.lastNode = null;
    }

    public T get(int index) {
        return this.getNode(index).getContent();
    }

    private DoublyNode<T> getNode(int index) {
        DoublyNode<T> auxNode = firstNode;

        for (int i = 0; (i < index) && (auxNode != null); i++) {
            auxNode = auxNode.getNextNode();
        }

        return auxNode;
    }

    public void add(T content) {
        DoublyNode<T> newNode = new DoublyNode<>(content);
        newNode.setNextNode(null);
        newNode.setPrevNode(lastNode);

        if (firstNode == null) {
            firstNode = newNode;
        }
        if (lastNode != null) {
            lastNode.setNextNode(newNode);
        }

        lastNode = newNode;
        listSize++;

    }

    public void add(int index, T content) {

        DoublyNode<T> tempNode = getNode(index);
        DoublyNode<T> newNode = new DoublyNode<>(content);
        newNode.setNextNode(tempNode);

        if (newNode.getNextNode() != null) {
            newNode.setPrevNode(tempNode.getPrevNode());
            newNode.getNextNode().setPrevNode(newNode);
        } else {
            newNode.setPrevNode(lastNode);
            lastNode = newNode;
        }

        if (index == 0) {
            firstNode = newNode;
        } else {
            newNode.getPrevNode().setNextNode(newNode);
        }
        listSize++;

    }

    public void remove(int index) {

        if (index == 0) {
            firstNode = firstNode.getNextNode();
            if (firstNode != null) {
                firstNode.setPrevNode(null);
            }
        } else {
            DoublyNode<T> auxNode = getNode(index);
            auxNode.getPrevNode().setNextNode(auxNode.getNextNode());
            if (auxNode != lastNode) {
                auxNode.getNextNode().setPrevNode(auxNode.getPrevNode());
            } else {
                lastNode = auxNode;
            }
        }

        this.listSize--;

    }

    public int size() {
        return listSize;
    }

    @Override
    public String toString() {
        String str = "";

        DoublyNode<T> auxNode = firstNode;
        for (int i = 0; i < size(); i++) {
            str += "[Node{content = " + auxNode.getContent() + " }] -> ";
            auxNode = auxNode.getNextNode();
        }

        str += "NULL";

        return str;
    }

}
