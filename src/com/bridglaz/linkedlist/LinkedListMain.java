package com.bridglaz.linkedlist;

public class LinkedListMain<T> {
    Node<T> head;
    Node<T> tail;

    public void addElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void appendElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node<T> temp = head;
        if (temp == null) {
            System.out.println("LinkedList is Empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedListMain<Integer> list = new LinkedListMain<>();
//        list.addElement(70);
//        list.addElement(30);
//        list.addElement(56);
//        list.print();

        list.appendElement(56);
        list.appendElement(30);
        list.appendElement(70);
        list.print();
    }
}
