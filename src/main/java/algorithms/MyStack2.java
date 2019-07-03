package algorithms;

public class MyStack2 {

    static class Stack{
        static int MAX_SIZE = 1000;
        static int top;
        static int[] stack = new int[MAX_SIZE];

        Stack(){
            top = -1;
        }

        static boolean isEmpty(){
            return top < 0;
        }

        static void push(int data){
            if(top >= MAX_SIZE -1){
                System.out.println("Stack Overflow");
            } else{
                stack[++top] = data;
            }
        }

        static int pop(){
            if(isEmpty()){
                System.out.println("StackUnderflow");
            } else {
                return stack[top--];
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
