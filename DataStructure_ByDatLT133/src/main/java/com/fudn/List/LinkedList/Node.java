package com.fudn.List.LinkedList;

public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

    public static void insertMid(Node head, Node tail, int data, int position){
        int index = 0;
        Node current = head;
        while(index < position -1 ) {
            current = current.next;
            index++;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a1 = new Node(2);
        Node a2 = new Node(11);
        Node a3 = new Node(22);
        Node a4 = new Node(33);
        Node a5 = new Node(44);
        Node a6 = new Node(55);
        Node tail = new Node(77);
        head.setNext(a1);
        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a4);
        a4.setNext(a5);
        a5.setNext(a6);
        a6.setNext(tail);
        insertMid(head, tail, 100, 2);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}

