package multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.LongBinaryOperator;
import java.util.stream.IntStream;

public class AtomicVariablesAndConcurrentMap {

    public static void main(String[] args) {

//        AtomicInteger atomicInt = new AtomicInteger(0);
//
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
//        IntStream.range(0, 1000)
//                .forEach(i -> executor.submit(atomicInt::incrementAndGet));
//
//        stop(executor);
//
//        System.out.println(atomicInt.get());    // => 1000

//        AtomicInteger atomicInt = new AtomicInteger(0);
//
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
//        IntStream.range(0, 1000)
//                .forEach(i -> {
//                    Runnable task = () ->
//                            atomicInt.updateAndGet(n -> n + 2);
//                    executor.submit(task);
//                });
//
//        stop(executor);
//
//        System.out.println(atomicInt.get());    // => 2000

//        AtomicInteger atomicInt = new AtomicInteger(0);
//
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
//        IntStream.range(0, 1000)
//                .forEach(i -> {
//                    Runnable task = () ->
//                            atomicInt.accumulateAndGet(i, (n, m) -> n + m);
//                    executor.submit(task);
//                });
//
//        stop(executor);
//
//        System.out.println(atomicInt.get());    // => 499500

        //LongAdder
        //This class is usually preferable over atomic numbers when updates from multiple threads are more common than reads. This is often the case when capturing statistical
        // data, e.g. you want to count the number of requests served on a web server. The drawback of LongAdder is higher memory consumption
        // because a set of variables is held in-memory.

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        LongAdder adder = new LongAdder();
//
//        IntStream.range(0, 1000)
//                .forEach(i -> executor.submit(adder::increment));
//
//        stop(executor);
//
//        System.out.println(adder.sumThenReset());   // => 1000

//        LongBinaryOperator op = (x, y) -> 2 * x + y;
//        LongAccumulator accumulator = new LongAccumulator(op, 1L);
//
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//
//        IntStream.range(0, 10)
//                .forEach(i -> executor.submit(() -> accumulator.accumulate(i)));
//
//        stop(executor);
//
//        System.out.println(accumulator.getThenReset());     // => 2539

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("foo", "bar");
        map.put("han", "solo");
        map.put("r2", "d2");
        map.put("c3", "p0");
        map.put("do", "ray");
        map.put("cat", "dog");
        map.put("tree", "leaf");
        map.put("sun", "moon");

//        map.forEach(1, (key, value) ->
//                System.out.printf("key: %s; value: %s; thread: %s\n",
//                        key, value, Thread.currentThread().getName()));

//        String result = map.search(1, (key, value) -> {
//            System.out.println(Thread.currentThread().getName());
//            if ("sun".equals(key)) {
//                return value;
//            }
//            return null;
//        });
//        System.out.println("Result: " + result);

        String result = map.reduce(1,
                (key, value) -> {
                    System.out.println("Transform: " + Thread.currentThread().getName());
                    return key + "=" + value;
                },
                (s1, s2) -> {
                    System.out.println("Reduce: " + Thread.currentThread().getName());
                    return s1 + ", " + s2;
                });

        System.out.println("Result: " + result);




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
