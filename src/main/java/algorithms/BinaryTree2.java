package algorithms;

public class BinaryTree2 {

    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }

        public void insert(int value){
            if(value <= data){
                if(left == null){
                    left = new Node(data);
                } else {
                    left.insert(data);
                }
            } else {
                if(right == null){
                    right = new Node(data);
                } else {
                    right.insert(data);
                }
            }
        }

        public boolean contains(int value){
            if(value == data){
                return true;
            }

            if(value <= data){
                if(left == null){
                    return false;
                } else {
                    right.contains(value);
                }
            } else {
                if(right == null){
                    return false;
                } else {
                    left.contains(value);
                }
            }

            return false;
        }
    }


}
