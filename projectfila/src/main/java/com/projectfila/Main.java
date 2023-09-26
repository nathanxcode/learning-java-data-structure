package com.projectfila;

public class Main {
    public static void main(String[] args) {

        Fila newFila = new Fila();

        newFila.enqueue("First");
        newFila.enqueue("Second");
        newFila.enqueue("Third");
        newFila.enqueue("Fourth");

        System.out.println(newFila);
        System.out.println(newFila.dequeue());
        System.out.println(newFila.dequeue());
        System.out.println(newFila.first());
    }
}