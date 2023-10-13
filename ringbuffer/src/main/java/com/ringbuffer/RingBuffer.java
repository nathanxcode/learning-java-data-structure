package com.ringbuffer;

public class RingBuffer<T> {

    Node<T> head;
    Node<T> tail;
    int listSize;

    public RingBuffer() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;

    }

    public void add(T content) {
        Node<T> newNode = new Node<>(content);

        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = head;
            this.head.setNextNode(tail);
        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;

    }

    public void remove(int index) {

        if (index >= size())
            throw new IndexOutOfBoundsException("Index is bigger than list size.");

        Node<T> auxNode = tail;
        if (index == 0) {
            this.tail = tail.getNextNode();
            this.head.setNextNode(this.tail);

        } else if (index == 1) {

            this.tail.setNextNode(this.tail.getNextNode());
        } else {
            for (int i = 0; i < index - 1; i++) {
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    public T get(int index) {
        return this.getNode(index).getContent();
    }

    private Node<T> getNode(int index) {

        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Empty List");

        if (index == 0) {
            return this.tail;
        }

        Node<T> auxNode = tail;
        for (int i = 0; (i < index); i++) {
            auxNode = auxNode.getNextNode();
        }

        return auxNode;

    }

    public boolean isEmpty() {
        return this.listSize == 0 ? true : false;
    }

    public int size() {
        return this.listSize;
    }

    public String toString() {
        String str = "";

        Node<T> auxNode = this.tail;
        for (int i = 0; i < size(); i++) {

            str += "Node[content{ " + auxNode.getContent() + " }] -> ";

            auxNode = auxNode.getNextNode();

        }

        str += this.size() != 0 ? "(back to start)" : "[]";

        return str;
    }

}
