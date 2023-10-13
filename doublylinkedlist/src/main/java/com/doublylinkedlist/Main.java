package com.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<String> myList = new DoublyLinkedList<>();
        myList.add("H");
        myList.add("E");
        myList.add("L");
        myList.add("L");
        myList.add("O");
        System.out.println(myList.size());
        System.out.println(myList);
        myList.add(2, "X");
        System.out.println(myList.size());
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList.size());
        System.out.println(myList);

    }
}