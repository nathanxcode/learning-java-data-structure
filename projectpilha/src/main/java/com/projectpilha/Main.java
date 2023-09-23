package com.projectpilha;

public class Main {
    public static void main(String[] args) {

        Pilha myStack = new Pilha();

        myStack.push(new Node(1));
        myStack.push(new Node(443));
        myStack.push(new Node(23));
        myStack.push(new Node(7));
        myStack.push(new Node(66));
        myStack.push(new Node(9));

        myStack.pop();
        System.out.println("length: " + myStack.length);
        myStack.pop();
        System.out.println("length: " + myStack.length);
        myStack.push(new Node(777));
        System.out.println("length: " + myStack.length);

        System.out.println("Is empty? " + myStack.isEmpty());
        System.out.println(myStack);

    }
}
