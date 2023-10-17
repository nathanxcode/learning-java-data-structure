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

    public void remove(T content) {
        try {

            BinNode<T> node = this.root;
            BinNode<T> parent = null;
            BinNode<T> children = null;
            BinNode<T> temp = null;

            while (node != null && !node.getContent().equals(content)) {
                parent = node;
                if (content.compareTo(node.getContent()) < 0) {
                    node = node.getLNode();
                } else {
                    node = node.getRNode();
                }
            }

            if (node == null) {
                System.out.println("Content not find, try!");

            }

            if (parent == null) {
                if (node.getRNode() == null) {
                    this.root = node.getLNode();
                } else if (node.getLNode() == null) {
                    this.root = node.getRNode();
                } else {
                    for (temp = node, children = node.getLNode(); children
                            .getRNode() != null; temp = children, children = children.getLNode()) {
                        if (children != node.getLNode()) {
                            temp.setRNode(children.getLNode());
                            children.setLNode(root.getLNode());
                        }
                    }
                    children.setRNode(root.getRNode());
                    root = children;
                }
            } else if (node.getRNode() == null) {
                if (parent.getLNode() == node) {
                    parent.setLNode(node.getLNode());
                } else {
                    parent.setRNode(node.getLNode());

                }
            } else if (node.getLNode() == null) {

            } else {

            }
        } catch (NullPointerException e) {
            System.out.println("Not find, catch!");
        }
    }

    public void showInOrder() {
        System.out.println("Showing in order");
        showInOrder(this.root);
    }

    private void showInOrder(BinNode<T> node) {
        if (node != null) {
            showInOrder(node.getLNode());
            System.out.println(node.getContent() + ", ");
            showInOrder(node.getRNode());
        }
    }

    public void showInPosOrder() {
        System.out.println("Showing pos order");
        showInPosOrder(this.root);
    }

    private void showInPosOrder(BinNode<T> node) {
        if (node != null) {
            showInOrder(node.getLNode());
            showInOrder(node.getRNode());
            System.out.println(node.getContent() + ", ");
        }
    }

    public void showInPreOrder() {
        System.out.println("Showing pos order");
        showInPreOrder(this.root);
    }

    private void showInPreOrder(BinNode<T> node) {
        if (node != null) {
            System.out.println(node.getContent() + ", ");
            showInOrder(node.getLNode());
            showInOrder(node.getRNode());
        }
    }

}
