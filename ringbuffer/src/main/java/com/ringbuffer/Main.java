package com.ringbuffer;

public class Main {
    public static void main(String[] args) {

        RingBuffer<String> myRingBuffer = new RingBuffer<>();
        myRingBuffer.add("D");
        myRingBuffer.add("L");
        myRingBuffer.add("R");
        myRingBuffer.add("O");
        myRingBuffer.add("W");
        System.out.println(myRingBuffer.size());
        System.out.println(myRingBuffer.isEmpty());
        System.out.println(myRingBuffer);
        myRingBuffer.remove(0);
        myRingBuffer.remove(1);
        myRingBuffer.remove(2);
        System.out.println(myRingBuffer.isEmpty());
        System.out.println(myRingBuffer);

    }
}