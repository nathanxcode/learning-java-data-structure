package com.binarytree;

public class BinaryTree<T extends Comparable<T>> {

    private BinNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T content) {
        BinNode<T> newNode = new BinNode<>(content);
        this.root = insert(this.root, newNode);
    }

    private BinNode<T> insert(BinNode<T> node, BinNode<T> newNode) {

        if (node == null) {
            return newNode;
        } else if (newNode.getContent().compareTo(node.getContent()) < 0) {
            node.setLNode(insert(node.getLNode(), newNode));
        } else {
            node.setRNode(insert(node.getRNode(), newNode));
        }
        return node;

    }

}
