package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceOtherDemo {

    public static void main(String args[]) {
        // creating executor with pool of 2 threads
        ExecutorService ex = Executors.newFixedThreadPool(2);
        // Callable implemented as lambda
        Callable<String> c = ()->"Callable lambda is called";
        // running tasks with callable as param
        Future f1 = ex.submit(c);
        try {
            // getting the future value
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
