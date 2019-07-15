package lambdas;

import java.util.function.Predicate;

public class TestPredicateInterfaces {
    Predicate<Integer> greaterThanTen = x -> x > 10;
    Predicate<Integer> divisibleByThree = x -> x % 3 == 0;
    Predicate<Integer> divisibleByFive = x -> x % 5 == 0;
    Predicate<Integer> equalToTen = Predicate.isEqual(null);

    // Create predicates using NOT, AND, and OR on other predicates
    Predicate<Integer> lessThanOrEqualToTen = greaterThanTen.negate();
    Predicate<Integer> divisibleByThreeAndFive = divisibleByThree.and(divisibleByFive);
    Predicate<Integer> divisibleByThreeOrFive = divisibleByThree.or(divisibleByFive);
}
