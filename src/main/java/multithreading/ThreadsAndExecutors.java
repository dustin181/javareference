package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ThreadsAndExecutors {

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");

        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Bar " + name);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello Executor " + threadName);
        });

        try {
            System.out.println("attempt to shutdown executor");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }

        Callable<Integer> task2 = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor2 = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor2.submit(task2);

        System.out.println("future done? " + future.isDone());

        Integer result = null;
        try {
            result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result + "\n");
        executor2.shutdownNow();

        ExecutorService executor3 = Executors.newFixedThreadPool(1);

        Future<Integer> future3 = executor3.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        try {
            future3.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        executor3.shutdownNow();

        ExecutorService executor4 = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
                () -> "task1",
                () -> "task2",
                () -> "task3");

        try {
            executor4.invokeAll(callables)
                    .stream()
                    .map(future4 -> {
                        try {
                            return future.get();
                        }
                        catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    })
                    .forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor4.shutdownNow();

        ScheduledExecutorService executor5 = Executors.newScheduledThreadPool(1);

        Runnable task5 = () -> System.out.println("\nScheduling: " + System.nanoTime());
        ScheduledFuture<?> future5 = executor5.schedule(task5, 3, TimeUnit.SECONDS);

        try {
            TimeUnit.MILLISECONDS.sleep(1337);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long remainingDelay = future5.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);

        //executor5.shutdown();

        ScheduledExecutorService executor6 = Executors.newScheduledThreadPool(1);

        Runnable task6 = () -> System.out.println("\nScheduling at fixed rate: " + System.nanoTime());

        int initialDelay = 0;
        int period = 1;
        executor6.scheduleAtFixedRate(task6, initialDelay, period, TimeUnit.SECONDS);

        ScheduledExecutorService executor7 = Executors.newScheduledThreadPool(1);

        Runnable task7 = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Scheduling with fixed delay: " + System.nanoTime());
            }
            catch (InterruptedException e) {
                System.err.println("task interrupted");
            }
        };

        executor7.scheduleWithFixedDelay(task7, 0, 1, TimeUnit.SECONDS);


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
