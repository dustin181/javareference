package algorithms;

public class BinaryTree {

   static class Node {
       int data;
       Node left, right;

       public Node(int data){
           this.data = data;
           left = right = null;
       }

       public void insert(int value){
           if(value <= data){
               if(left == null){
                   left = new Node(value);
               } else{
                   left.insert(value);
               }
           } else {
               if(right == null){
                   right = new Node(value);
               } else {
                   right.insert(value);
               }
           }
       }

       public boolean contains(int value){
           if(value == data){
               return true;
           } else if(value < data){
               if(left == null){
                   return false;
               } else{
                   return left.contains(value);
               }
           } else {
               if(right == null){
                   return false;
               } else {
                   return right.contains(value);
               }
           }
       }

       public void printInOrder(){

           if(left != null){
               left.printInOrder();
           }

           if(right != null){
               right.printInOrder();
           }

           System.out.println(data);
       }

   }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.insert(5);
        root.insert(10);
        root.insert(3);
        root.insert(45);
        root.insert(34);
        root.insert(90);


        root.printInOrder();

    }

}
