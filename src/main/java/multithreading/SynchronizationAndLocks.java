package multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class SynchronizationAndLocks {

    public static void main(String[] args) {

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        ReentrantLock lock = new ReentrantLock();
//
//        executor.submit(() -> {
//            lock.lock();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock.unlock();
//            }
//        });
//
//        executor.submit(() -> {
//            System.out.println("Locked: " + lock.isLocked());
//            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
//            boolean locked = lock.tryLock();
//            System.out.println("Lock acquired: " + locked);
//        });
//
//        executor.shutdown();

//        ExecutorService executor2 = Executors.newFixedThreadPool(2);
//        Map<String, String> map = new HashMap<>();
//        ReadWriteLock lock2 = new ReentrantReadWriteLock();
//
//        Runnable readTask = () -> {
//            lock2.readLock().lock();
//            try {
//                System.out.println(map.get("foo"));
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock2.readLock().unlock();
//            }
//        };
//
//        executor2.submit(() -> {
//            lock2.writeLock().lock();
//            try {
//                Thread.sleep(1000);
//                map.put("foo", "bar");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock2.writeLock().unlock();
//            }
//        });
//
//        executor2.submit(readTask);
//        executor2.submit(readTask);
//
//        executor2.shutdown();

//        ExecutorService executor3 = Executors.newFixedThreadPool(2);
//        Map<String, String> map3 = new HashMap<>();
//        StampedLock lock3 = new StampedLock();
//
//        executor3.submit(() -> {
//            long stamp = lock3.writeLock();
//            try {
//                Thread.sleep(1000);
//                map3.put("foo", "bar");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock3.unlockWrite(stamp);
//            }
//        });
//
//        Runnable readTask3 = () -> {
//            long stamp = lock3.readLock();
//            try {
//                System.out.println(map3.get("foo"));
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock3.unlockRead(stamp);
//            }
//        };
//
//        executor3.submit(readTask3);
//        executor3.submit(readTask3);

        //executor3.shutdown();

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        Map<String, String> map = new HashMap<>();
//        StampedLock lock = new StampedLock();
//
//        executor.submit(() -> {
//            long stamp = lock.writeLock();
//            try {
//                sleep(1);
//                map.put("foo", "bar");
//            } finally {
//                lock.unlockWrite(stamp);
//            }
//        });
//
//        Runnable readTask = () -> {
//            long stamp = lock.readLock();
//            try {
//                System.out.println(map.get("foo"));
//                sleep(1);
//            } finally {
//                lock.unlockRead(stamp);
//            }
//        };
//
//        executor.submit(readTask);
//        executor.submit(readTask);
//
//        stop(executor);

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        StampedLock lock = new StampedLock();
//
//        executor.submit(() -> {
//            long stamp = lock.tryOptimisticRead();
//            try {
//                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
//                sleep(1);
//                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
//                sleep(2);
//                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
//            } finally {
//                lock.unlock(stamp);
//            }
//        });
//
//        executor.submit(() -> {
//            long stamp = lock.writeLock();
//            try {
//                System.out.println("Write Lock acquired");
//                sleep(2);
//            } finally {
//                lock.unlock(stamp);
//                System.out.println("Write done");
//            }
//        });
//
//        stop(executor);

        ExecutorService executor4 = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(5);

        Runnable longRunningTask = () -> {
            boolean permit = false;
            try {
                permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                if (permit) {
                    System.out.println("Semaphore acquired");
                    Thread.sleep(5000);
                } else {
                    System.out.println("Could not acquire semaphore");
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            } finally {
                if (permit) {
                    semaphore.release();
                }
            }
        };

        IntStream.range(0, 10)
                .forEach(i -> executor4.submit(longRunningTask));

        executor4.shutdown();
    }

    public static void stop(ExecutorService executor) {
        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executor.shutdownNow();
        }
    }

    public static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
