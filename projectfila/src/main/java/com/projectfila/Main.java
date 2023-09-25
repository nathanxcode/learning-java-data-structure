package com.projectfila;

public class Main {
    public static void main(String[] args) {

        Fila newFila = new Fila();

        newFila.enqueue(new Node("First"));
        newFila.enqueue(new Node("Second"));
        newFila.enqueue(new Node("Third"));
        newFila.enqueue(new Node("Fourth"));

        System.out.println(newFila);
        System.out.println(newFila.dequeue());
        System.out.println(newFila.dequeue());
        System.out.println(newFila.first());
    }
}