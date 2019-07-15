package lambdas;

import java.util.function.Function;

public class TestFunctionalInterfaces {

    @FunctionalInterface
    interface AddMapper {
        int map(int x);
    }

    @FunctionalInterface
    interface SumMapper {
        int map(int x, int y);
    }

    public static void main(String[] args) {
        AddMapper addOneMapper = x -> x + 1;
        SumMapper sumMapper = (x, y) -> x + y;

        Function<Integer, Integer> square1 = x -> x * x;
        Function<Integer, Integer> addThree = x -> x +3;

        System.out.println(addOneMapper.map(7));
        System.out.println(sumMapper.map(8, 9));
        System.out.println(square1.andThen(addThree).apply(5));
        System.out.println(square1.compose(addThree).apply(5));
    }
}
