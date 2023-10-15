package com.binarytree;

public class BinNode<T extends Comparable<T>> {

    private T content;
    private BinNode<T> LNode;
    private BinNode<T> RNode;

    public BinNode(T content) {
        this.content = content;
        this.LNode = this.RNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinNode<T> getLNode() {
        return LNode;
    }

    public void setLNode(BinNode<T> lNode) {
        LNode = lNode;
    }

    public BinNode<T> getRNode() {
        return RNode;
    }

    public void setRNode(BinNode<T> rNode) {
        RNode = rNode;
    }

    @Override
    public String toString() {
        return "BinNode [content=" + content + "]";
    }

}
