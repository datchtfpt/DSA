package com.fudn.List.Queue;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public void enqueue(int data, Node rear) {
        Node newNode = new Node(data);
        rear.next = newNode;
        rear = newNode;
    }

    public Node dequeue(int k, Node front) {
        Node temp = front;
        for(int i=0; i<k; i++) {
            front = front.next;

        }
        return front;
    }

    public static void main(String[] args) {

        Node front, rear;
        front = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        rear = new Node(5);

        front.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = rear;

        front.enqueue(6, rear);
        front = front.dequeue(3, front);
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}