package com.projectpilha;

public class Pilha {

    /*
     * LIFO
     * Last in, First out
     */

    private Node refNode;
    public int length = 0;

    public Pilha() {
        this.refNode = null;
    }

    public Node top() {
        return refNode;
    }

    public void push(Node newNode) {
        Node temp = refNode;
        refNode = newNode;
        refNode.setNode(temp);
        length++;
    }

    public Node pop() {
        if (!this.isEmpty()) {
            Node nodePoped = refNode;
            refNode = refNode.getNode();
            length--;
            return nodePoped;
        }

        return null;
    }

    public boolean isEmpty() {

        return refNode == null ? true : false;
    }

    @Override
    public String toString() {

        String returnString = "-------------";
        returnString += "Stack";
        returnString += "-------------\n";

        Node temp = refNode;

        while (true) {
            if (temp != null) {
                returnString += "Node[" + temp.getValue() + "]\n";
                temp = temp.getNode();
            } else {
                break;
            }
        }

        return returnString += "-------------Stack-------------";

    }

}
