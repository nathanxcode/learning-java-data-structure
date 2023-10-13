package com.ringbuffer;

public class RingBuffer<T> {

    Node<T> head;
    Node<T> tail;
    int listSize;

    public RingBuffer() {

        this.listSize = 0;

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

}
