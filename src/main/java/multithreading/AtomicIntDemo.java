package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntDemo {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(0);
        new Thread(new IncThread(ai)).start();
        new Thread(new IncThread(ai)).start();
        new Thread(new IncThread(ai)).start();
    }

}

class IncThread implements Runnable{
    AtomicInteger ai = null;
    IncThread(AtomicInteger ai){
        this.ai = ai;
    }

    @Override
    public void run() {
        System.out.println("Value - " + ai.getAndIncrement() + " for "
                + Thread.currentThread().getName());
    }
}
