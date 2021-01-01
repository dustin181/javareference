package generics3;

import java.util.Arrays;
import java.util.List;

public class GenericsRestrictTypes {


    //Two different choices for the same thing, but this is simpler
    public static double sum(List<? extends Number> numberlist) {
        double sum = 0.0;
        for (Number n : numberlist) sum += n.doubleValue();
        return sum;
    }

    //Two different choices for the same thing, use when you need to refer to it in the method
    public static <T extends Number> double sum2(List<T> numberlist) {
        double sum = 0.0;
        for (Number n : numberlist) sum += n.doubleValue();
        return sum;
    }

    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sum(integerList));

        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sum(doubleList));
    }
}