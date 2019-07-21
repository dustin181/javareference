package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class TestMethodReferences {

    public static void main(String[] args) {
        ToIntFunction<String> lengthFunction = str -> str.length();
        String name = "Ellen";
        int len = lengthFunction.applyAsInt(name);
        System.out.println("Name = " + name + ", length = " + len);

        ToIntFunction<String> lengthFunction2 = String::length;
        String name2 = "Ellen";
        int len2 = lengthFunction2.applyAsInt(name);
        System.out.println("Name = " + name2 + ", length = " + len2);

        Function<Integer,String> func1 = x -> Integer.toBinaryString(x);
        System.out.println(func1.apply(17));

        // Uses a method reference
        Function<Integer, String> func2 = Integer::toBinaryString;
        System.out.println(func2.apply(17));

        // Uses a lambda expression
        BiFunction<Integer,Integer,Integer> func3 = (x, y) -> Integer.sum(x, y);
        System.out.println(func3.apply(17, 15));

        Supplier<List<Person>> supplier = Person::getPersons;
        List<Person> personList = supplier.get();

        Function<Person,String> fNameFunc = (Person p) -> p.getFirstName();
        Function<Person,String> fNameFunc2 = Person::getFirstName;

        Function<String,Integer> strLengthFunc = String::length;
        String name3 ="Ellen";
        int len3 = strLengthFunc.apply(name);
        System.out.println("name = " + name3 + ", length = " + len3);

        String greeting5 = "Hello";
        String name5 = " Laynie";

        // Uses a lambda expression
        BiFunction<String,String,String> func4 = (s1, s2) -> s1.concat(s2);
        System.out.println(func4.apply(greeting5, name5));
        // Uses an instance method reference on an unbound receiver
        BiFunction<String,String,String> func5 = String::concat;
        System.out.println(func5.apply(greeting5, name5));

//        List<String> str = Arrays.asList("a","b","A","B");
//        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        List<String> str = Arrays.asList("a","b","A","B");
        str.sort(String::compareToIgnoreCase);

    }


}
