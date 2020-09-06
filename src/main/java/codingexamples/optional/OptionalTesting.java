package codingexamples.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalTesting {

    public static final String BOOK_STATUS = "UNKNOWN";

    public static void main(String[] args) {

        Optional<String> book = Optional.empty();

        System.out.println(book.orElse(BOOK_STATUS));

        book.ifPresent(System.out::println);

        //prefer this one
        //book.orElseGet(this::computeStatus);

        book.orElseThrow(() -> new NoSuchElementException("Status cannot be found"));

    }
}
