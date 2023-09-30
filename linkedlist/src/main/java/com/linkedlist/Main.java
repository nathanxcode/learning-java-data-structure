package com.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myList = new LinkedList<>();
        myList.add(new Node(1));
        myList.add(new Node(2));
        myList.add(new Node(2));
        myList.add(new Node(2));
        myList.add(new Node(2));
        myList.add(new Node(2));
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList);

    }
}