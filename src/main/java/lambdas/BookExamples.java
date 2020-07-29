package lambdas;

public class BookExamples {

    /*A stream that contains only computing books:
    Stream<Book> computingBooks = library.stream()
            .filter(b -> b.getTopic() == COMPUTING);
    A stream of book titles:
    Stream <String> bookTitles = library.stream()
            .map(Book::getTitle);
    A stream of Book, sorted by title:
    Stream<Book> booksSortedByTitle = library.stream()
            .sorted(Comparator.comparing(Book::getTitle));
    Use this sorted stream to create a stream of authors, in order of book title,
    with duplicates removed:
    Stream<String> authorsInBookTitleOrder = library.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .flatMap(book -> book.getAuthors().stream())
            .distinct();
    A stream yielding the 􀃥rst 100 books in alphabetical order of title:
    Stream<Book> readingList = library.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .limit(100);
    A stream with the rest:
    Stream<Book> remainderList = library.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .skip(100);
    The earliest-published book in my library:
    Optional<Book> oldest = library.stream()
            .min(Comparator.comparing(Book::getPubDate));
    The set of titles of the books in my library:
    Set<String> titles = library.stream()
            .map(Book::getTitle)
            .collect(Collectors.toSet());

   filter:
   Stream<Book> computingBooks = library.stream()
            .filter(b -> b.getTopic() == COMPUTING);

   map:
    Stream<Year> bookTitles = library.stream()
            .map(Book::getPubDate);

    debug:
    List<Book> multipleAuthoredHistories = library.stream()
            .filter(b -> b.getTopic() == Book.Topic.HISTORY)
            .peek(b -> System.out.println(b.getTitle()))
            .filter(b -> b.getAuthors().size() > 1)
            .collect(toList());

    sort:
    Stream<String> sortedTitles = library.stream()
            .map(Book::getTitle)
            .sorted();

    Stream<Book> booksSortedByTitle = library.stream()
            .sorted(Comparator.comparing(Book::getTitle));

    Stream<Book> booksSortedByAuthorCount = library.stream()
            .sorted(Comparator.comparing(Book::getAuthors,
                    Comparator.comparing(List::size)));

    truncate:
    Stream<Book> readingList = library.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .limit(100);

    Stream<Book> remainderList = library.stream()
            .sorted(Comparator.comparing(Book::getTitle))
            .skip(100);

    search:
    boolean withinShelfHeight = library.stream()
            .filter(b -> b.getTopic() == HISTORY)
            .allMatch(b -> b.getHeight() < 19);

    Optional<Book> anyBook = library.stream()
            .filter(b -> b.getAuthors().contains("Herman Melville"))
            .findAny();

    • get: Returns a value if one is present; otherwise, this method throws
    NoSuchElementException. This is the “unsafe” operation for accessing an
    Optional’s contents, normally to be avoided in favor of one of the following
    safe alternatives.

    • ifPresent: If a value is present, supplies it to the Consumer; otherwise, does
    nothing.

    • isPresent: Returns true if a value is present; otherwise, returns false.

    • orElse: Returns the value if present; otherwise, returns the argument. This and
    orElseGet are the safe operations for accessing the contents. In the normal
    use of Optional, with the possibility of an empty value, these operations are
    more useful than get.

    • orElseGet: Returns the value if present; otherwise, invokes the Supplier and
    returns its result.


    collect to map:
    Map<String,Year> titleToPubDate = library.stream()
            .collect(toMap(Book::getTitle, Book::getPubDate));

    sum:
    int totalPageCount = library.stream()
            .mapToInt(Book::getPageCount)
            .sum();

    Collector Pattern:
    A map classifying books by topic:
    Map<Topic,List<Book>> booksByTopic = library.stream()
            .collect(groupingBy(Book::getTopic));
    An ordered map from book titles to publication date of latest edition:
    Map<String,Year> titleToPubDate = library.stream()
            .collect(toMap(Book::getTitle,
                    Book::getPubDate,
                    BinaryOperator.maxBy(naturalOrder()),
                    TreeMap::new));
    A map partitioning books into 􀃥ction (mapped to true) and non-􀃥ction ( false):
    Map<Boolean,List<Book>> fictionOrNon = library.stream()
            .collect(partitioningBy(b -> b.getTopic() == FICTION));
    A map associating each topic with the book on that topic having the most authors:
    Map<Topic,Optional<Book>> mostAuthorsByTopic = library.stream()
            .collect(groupingBy(Book::getTopic,
                    maxBy(comparing(b -> b.getAuthors().size()))));
    A map associating each topic with the total number of volumes on that topic:
    Map<Topic,Integer> volumeCountByTopic = library.stream()
            .collect(groupingBy(Book::getTopic,
                    summingInt(b -> b.getPageCounts().length)));
    The topic with the most books:
    Optional<Topic> mostPopularTopic = library.stream()
            .collect(groupingBy(Book::getTopic, counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey);
    A map from each topic to the concatenation of all the book titles on that topic:
    Map<Topic,String> concatenatedTitlesByTopic = library.stream()
            .collect(groupingBy(Book::getTopic,
                    mapping(Book::getTitle, joining(";"))));


    joining:
    String concatenatedTitles = library.stream()
            .map(Book::getTitle)
            .collect(joining("::"));

    List<String> authorsForBooks = library.stream()
            .map(b -> b.getAuthors().stream()
                    .collect(joining(", ", b.getTitle() + ": ", "")))
            .collect(toList());

    groupby:
    Map<Topic,List<Book>> booksByTopic = library.stream()
            .collect(groupingBy(Book::getTopic));

    Map<Topic,List<Book>> booksByTopic = library.stream()
            .collect(groupingBy(Book::getTopic, Collectors.toList()));

    Map<Topic,Long> distributionByTopic = library.stream()
            .collect(groupingBy(Book::getTopic, Collectors.counting()));

    Map<Topic,Optional<Book>> mostAuthorsByTopic = library.stream()
            .collect(groupingBy(Book::getTopic,
                    maxBy(comparing(b -> b.getAuthors().size()))));

    Map<Topic,Integer> volumeCountByTopic = library.stream()
            .collect(groupingBy(Book::getTopic,
                    summingInt(b -> b.getPageCounts().length)));

    Map<Topic,Double> averageHeightByTopic = library.stream()
            .collect(groupingBy(Book::getTopic,
                    averagingDouble(Book::getHeight)));

    mapping:
    Map<Topic,String> concatenatedTitlesByTopic = library.stream()
            .collect(groupingBy(Book::getTopic,
                    mapping(Book::getTitle, joining(";"))));

    partitionby:
    Map<Boolean,List<Book>> fictionOrNonFiction = library.stream()
            .collect(partitioningBy(b -> b.getTopic() == FICTION ||
                    b.getTopic() == SCIENCE_FICTION));

    chaining:

    Stream<Map.Entry<Topic,Long>> entries = library.stream()
            .collect(groupingBy(Book::getTopic, counting()))
            .entrySet().stream();

    plus

    Optional<Topic> mostPopularTopic = entries
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey);

    equals

    Optional<Topic> mostPopularTopic = library.stream()
            .collect(groupingBy(Book::getTopic, counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey);
*/
}
