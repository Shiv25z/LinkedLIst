package com.assignmentDay14;



public class LinkedListAssignment {
   static Node head;
    static Node tail;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedListAssignment append(LinkedListAssignment list, int data){

        Node new_node = new Node(data);


        if (list.head == null) {
            list.head = new_node;
        }
        else {

            new_node.next = head;
            head = new_node;
        }

        return list;
    }


    public static void printList(LinkedListAssignment list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " -> ");

            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args){
        System.out.println("Welcome to Linked List Assignment");
        LinkedListAssignment list = new LinkedListAssignment();// UC2


        list = append(list, 70);//UC3
        list = append(list, 30);
        list = append(list, 56);

        printList(list);
    }
}