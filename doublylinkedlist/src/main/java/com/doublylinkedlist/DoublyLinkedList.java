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

    public int size() {
        return listSize;
    }
}
