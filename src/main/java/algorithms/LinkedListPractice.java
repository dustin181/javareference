package algorithms;

public class LinkedListPractice {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static int getNthNode(int n){

        Node current = head;

        int count = 0;

        while(current != null){

            if(count == n){
                return current.data;
            }

            current = current.next;
            count++;

        }

        return 0;

    }

    static int getNthNodeFromEnd(int n){

        int length = getLength();

        if(n > length){
            return -1;
        }

        Node current = head;
        Node trailer = head;

        int count = 0;

        while(current != null){

            if(count > n){
                trailer = trailer.next;
            }

            current = current.next;
            count++;
        }

        return trailer.data;

    }

    static boolean searchForElement(int key){
        Node current = head;

        while(current != null){
            if(current.data == key){
                return true;
            }

            current = current.next;
        }

        return false;
    }

    static void deleteList(){

        Node prev = null;
        Node current = head;

        while(current != null){
          prev = current;
          current = current.next;
          prev.next = null;
        }

        head = null;
    }

    static void deleteNode(int key){
        Node current = head;
        Node prev = null;

        if(current != null && current.data == key){
            head = current.next;
            return;
        }

        while(current != null && current.data != key){
            prev = current;
            current = current.next;
        }

        if(current == null){
            return;
        }

        prev.next = current.next;
    }

    static int getMiddle(){

        Node current = head;
        Node trailer = head;

        while(current != null && current.next != null){

            current = current.next.next;
            trailer = trailer.next;
        }

        return trailer.data;
    }

    static int getLength(){
        Node n = head;
        int count = 0;

        while(n != null){
            count++;
            n = n.next;
        }

        return count;
    }

    static void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }

    static void reverseNodes(){

        Node prev = null;
        Node current = head;
        Node next = current.next;

        while(current != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;
    }

    static void removeDuplicates()
    {
        /*Another reference to head*/
        Node curr = head;

        /* Traverse list till the last node */
        while (curr != null) {
            Node temp = curr;
            /*Compare current node with the next node and
            keep on deleting them until it matches the current
            node data */
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
            /*Set current node next to the next different
            element denoted by temp*/
            curr.next = temp;
            curr = curr.next;
        }
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

        //deleteNode(5);

        //System.out.println(getLength());

        //deleteList();

//        System.out.println(getNthNodeFromEnd(0));
//        System.out.println(getNthNodeFromEnd(2));
//        System.out.println(getNthNodeFromEnd(3));

        //System.out.println(getMiddle());

        printList();
        reverseNodes();
        System.out.println();
        printList();
    }

}
