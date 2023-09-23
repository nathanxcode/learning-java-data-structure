package com.projectnode;

public class Main {

    public static void main(String[] args) {
        Node<String> node = new Node<String>("nodecontent");

        Node<String> node2 = new Node<String>("node2 content");
        node.setNextNode(node2);

        Node<String> node3 = new Node<String>("node3 content");
        node2.setNextNode(node3);

        Node<String> node4 = new Node<String>("node4 content");
        node3.setNextNode(node4);

        System.out.println(node.getNextNode());

    }

}
