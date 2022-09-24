package com.bridglaz.linkedlist;

public class LinkedList<T> {
    public void print(T data) {
        System.out.print(data + "->");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.print(56);
        list.print(30);
        list.print(70);
        System.out.println("null");
    }
}
