package multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierWithBlock {

    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3);
        // Creating two threads with CyclicBarrier obj as param
        Thread t1 = new Thread(new FirstService(cb));
        Thread t2 = new Thread(new SecondService(cb));
        System.out.println("starting threads ");
        t1.start();
        t2.start();

        try {
            // Calling await for main thread
            cb.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // once await is called for all the three threads, execution starts again
        System.out.println("In main thread, processing starts again ..... ");
    }

}

class FirstService implements Runnable {
    CyclicBarrier cb;
    FirstService(CyclicBarrier cb){
        this.cb = cb;
    }
    @Override
    public void run() {
        System.out.println("In First service, thread " + Thread.currentThread().getName());
        try {
            // Calling await for Thread-0
            cb.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class SecondService implements Runnable {
    CyclicBarrier cb;
    SecondService(CyclicBarrier cb){
        this.cb = cb;
    }
    @Override
    public void run() {
        System.out.println("In Second service, thread " + Thread.currentThread().getName());
        try {
            // Calling await for Thread-1
            cb.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
