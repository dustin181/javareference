package algorithms;

public class StackPractice {

    private static final int MAX_SIZE = 20;

    int top;
    int[] a = new int[MAX_SIZE];

    StackPractice() {
        top = -1;
    }

    private Integer pop() {

        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    private boolean push(int x) {

        if(top > MAX_SIZE - 1){
            System.out.println("Stack Overflow");
            return false;
        } else{
            a[++top] = x;
            return true;
        }
    }

    private boolean isEmpty() {
        return (top < 0);
    }

    public static void main(String[] args) {
        StackPractice s = new StackPractice();

        System.out.println(s.isEmpty());

        System.out.println("Pop from stack: " + s.pop());
        s.push(23);
        s.push(45);
        s.push(8);
        System.out.println("Pop from stack: " + s.pop());
    }




}
