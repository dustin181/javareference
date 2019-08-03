package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(3);
        // Initializing three threads to read 3 different files.
        Thread t1 = new Thread(new FileReader("thread-1", "file-1", cdl));
        Thread t2 = new Thread(new FileReader("thread-2", "file-2", cdl));
        Thread t3 = new Thread(new FileReader("thread-3", "file-3", cdl));
        t1.start();
        t2.start();
        t3.start();
        try {
            // main thread waiting till all the files are read
            cdl.await();//comment this out if you want main thread to resume before threads are done
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Files are read ... Start further processing");
    }

}

class FileReader implements Runnable {
    private String threadName;
    private String fileName;
    private CountDownLatch cdl;
    FileReader(String threadName, String fileName, CountDownLatch cdl){
        this.threadName = threadName;
        this.fileName = fileName;
        this.cdl = cdl;
    }
    @Override
    public void run() {
        System.out.println("Reading file " + fileName + " thread " + threadName);
        // do countdown here
        cdl.countDown();
    }
}
