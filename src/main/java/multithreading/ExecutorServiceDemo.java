package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String args[]) {
        // creating executor with pool of 2 threads
        ExecutorService ex = Executors.newFixedThreadPool(2);
        // running tasks
        Future f1 = ex.submit(new Task2());
        Future f2 = ex.submit(new Task2());
        try {
            // getting the future value
            System.out.println("Future f1 " + f1.get());
            System.out.println("Future f1 " + f1.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ex.shutdown();

    }
}

/**
 * Runnable
 */
class Task2 implements Runnable{

    @Override
    public void run(){
        System.out.println("in run task for thread - " + Thread.currentThread().getName());
        // Introducing some delay for switching
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();

        }
    }
}
