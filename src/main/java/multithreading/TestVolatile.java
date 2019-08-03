package multithreading;

public class TestVolatile {
    private static volatile boolean flag = false; //this is a deadlock without the volatile setting
    public static void main(String[] args) {
        // implemented as anonymous inner class
        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 1; i <= 5000; i++){
                    System.out.println("printing value " + i);
                }
                flag = true;
            }

        }).start();

        // Implemented as lambda expression
        new Thread(()-> {
            int i = 1;
            while (!flag) i++;
            System.out.println("Job Done " + i);
        }).start();
    }
}