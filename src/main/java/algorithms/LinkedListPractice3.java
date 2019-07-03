package algorithms;

public class LinkedListPractice3 {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static int getLength(){
        Node temp = head;
        int i = 0;

        while(temp != null){
            i++;
            temp = temp.next;

        }

        return i;
    }

    static void insertAfter(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static void insertBefore(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        newNode.next = temp;
        head = newNode;
    }

    static void printList(){

        if(head == null){
            return;
        }

        Node temp = head;

        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println(temp.data);

    }

    static boolean searchForElement(int key){

        if(head == null){
            return false;
        }

        Node temp = head;

        while(temp.next != null && temp.data != key){
            temp = temp.next;
        }

        if(temp.data == key){
            return true;
        } else{
            return false;
        }

    }

    static int getNthNode(int n){

        if(head == null){
            return 0;
        }
        int count = 1;

        Node temp = head;

        while(temp.next != null){

            if(count == n){
                return temp.data;
            }

            count++;
            temp = temp.next;
        }

        if(count == n){
            return temp.data;
        } else {
            return -1;
        }

    }

    static int getNthNodeFromEnd(int n){

        int length = getLength();

        if(head == null){
            return 0;
        }
        int count = 0;

        Node temp = head;

        while(temp.next != null){

            if(count == length - n){
                return temp.data;
            }

            count++;
            temp = temp.next;
        }

        if(count == length - n){
            return temp.data;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {

        insertAfter(5);
        insertAfter(87);
        insertAfter(10222);
        insertAfter(1334);
        insertAfter(173);
        insertAfter(99);
        insertAfter(102);
        insertAfter(34);

        insertBefore(45);
        insertBefore(9000);

//        System.out.println(getLength());
//        printList();

//        System.out.println(searchForElement(10222));
//        System.out.println(searchForElement(173));
//        System.out.println(searchForElement(155555555));
//        System.out.println(searchForElement(2344));

        printList();
        System.out.println("*******");
        System.out.println(getNthNodeFromEnd(0));
        System.out.println(getNthNodeFromEnd(5));
        System.out.println(getNthNodeFromEnd(10));


    }
}
