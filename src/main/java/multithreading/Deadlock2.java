package multithreading;

public class Deadlock2 {

    public static void main(String[] args) throws InterruptedException {
        A a = new A();

        Runnable r1 = () -> a.a();
        Runnable r2 = () -> a.b();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    static class A {
        private Object key1 = new Object();
        private Object key2 = new Object();

        void a(){
            synchronized (key1){
                System.out.println(Thread.currentThread().getName());
                b();
            }
        }

        void b(){
            synchronized (key2){
                System.out.println(Thread.currentThread().getName());
                c();
            }
        }

        void c(){
            synchronized (key1){
                System.out.println(Thread.currentThread().getName());

            }
        }
    }
}
