package algorithms;

public class CircularLinkedListPractice {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static void printList(Node head){

        Node temp = head;

        System.out.print(temp.data + " ");
        temp = temp.next;

        while(temp != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static boolean isCircular(Node head){

        Node temp = head;

        temp = temp.next;

        while(temp != head && temp != null){
            temp = temp.next;
        }

        if(temp == head){
            return true;
        } else if (temp == null){
            return false;
        }

        return false;
    }

    // Function to exchange
// first and last node
    static Node exchangeNodes( Node head)
    {
        // Find pointer to previous
        // of last node
        Node p = head;
        while (p.next.next != head)
            p = p.next;

        // Exchange first and last
        // nodes using head and p
        p.next.next = head.next;
        head.next = p.next;
        p.next = head;
        head = head.next;

        return head;
    }

    public static void main(String[] args) {

        Node first = new Node(11);
        Node second = new Node(12);
        Node fourth = new Node(133);
        Node fifth = new Node(21);
        Node sixth = new Node(49);
        Node seventh = new Node(43);
        Node eighth = new Node(60);

        head = first;
        first.next = second;
        second.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = head;

        //printList(head);

        exchangeNodes(head);
        System.out.println(isCircular(head));

    }

}
