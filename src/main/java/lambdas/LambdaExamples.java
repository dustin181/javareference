/*
package lambdas;

public class LambdaExamples {

    //count
    long count = allArtists.stream()
            .filter(artist -> artist.isFrom("London"))
            .count();

    //collect
    List<String> collected = Stream.of("a", "b", "c")
            .collect(Collectors.toList());

    //map
    List<String> collected = Stream.of("a", "b", "hello")
            .map(string -> string.toUpperCase())
            .collect(toList());

    //more complicated map example
    public static List<String> elementFirstToUpperCaseLambdas(List<String> words) {
        return words.stream()
                .map(value -> {
                    char firstChar = Character.toUpperCase(value.charAt(0));
                    return firstChar + value.substring(1);
                })
                .collect(Collectors.<String>toList());
    }

    //filter
    List<String> beginningWithNumbers
            = Stream.of("a", "1abc", "abc1")
            .filter(value -> isDigit(value.charAt(0)))
            .collect(toList());

    //flatMap
    List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
            .flatMap(numbers -> numbers.stream())
            .collect(toList());

    //min
    List<Track> tracks = asList(new Track("Bakai", 524),
            new Track("Violets for Your Furs", 378),
            new Track("Time Was", 451));
    Track shortestTrack = tracks.stream()
            .min(Comparator.comparing(track -> track.getLength()))
            .get();

    //reduce: The count will be 6
    int count = Stream.of(1, 2, 3)
            .reduce(0, (acc, element) -> acc + element);

    //larger example
    //1. Get all the artists for an album. --> There’s a nice getMusicians method on our Album class that returns a Stream.
    //2. Figure out which artists are bands. --> We use filter to trim down the artists to include only bands.
    //3. Find the nationalities of each band. --> We use map to turn the band into its nationality.
    //4. Put together a set of these values. --> We use collect(toList()) to put together a list of these nationalities.
    Set<String> origins = album.getMusicians()
            .filter(artist -> artist.getName().startsWith("The"))
            .map(artist -> artist.getNationality())
            .collect(toSet());

    //max
    public Optional<Artist> biggestGroup(Stream<Artist> artists) {
        Function<Artist,Long> getCount = artist -> artist.getMembers().count();
        return artists.collect(maxBy(comparing(getCount)));
    }

    //avg
    public double averageNumberOfTracks(List<Album> albums) {
        return albums.stream()
                .collect(averagingInt(album -> album.getTrackList().size()));
    }

    //partition
    public Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
        return artists.collect(partitioningBy(artist -> artist.isSolo()));
    }

    //groupby
    public Map<Artist, List<Album>> albumsByArtist(Stream<Album> albums) {
        return albums.collect(groupingBy(album -> album.getMainMusician()));
    }

    //string join with delimiter, beginning and end
    String result =
            artists.stream()
                    .map(Artist::getName)
                    .collect(Collectors.joining(", ", "[", "]"));

    //groupby and count
    public Map<Artist, Long> numberOfAlbums(Stream<Album> albums) {
        return albums.collect(groupingBy(album -> album.getMainMusician(),
                counting()));
    }

    //groupby and get names of every album that artist has produced
    public Map<Artist, List<String>> nameOfAlbums(Stream<Album> albums) {
        return albums.collect(groupingBy(Album::getMainMusician,
                mapping(Album::getName, toList())));
    }

    //map --> get from db if not in cache
    public Artist getArtist(String name) {
        return artistCache.computeIfAbsent(name, this::readArtistFromDB);
    }

    //iterate over a map
    Map<Artist, Integer> countOfAlbums = new HashMap<>();
    albumsByArtist.forEach((artist, albums) -> {
        countOfAlbums.put(artist, albums.size());
    });

    //use function in a lambda
    public static List<String> elementFirstToUppercase(List<String> words) {
        return words.stream()
                .map(Testing::firstToUppercase)
                .collect(Collectors.<String>toList());
    }
    public static String firstToUppercase(String value) {
        char firstChar = Character.toUpperCase(value.charAt(0));
        return firstChar + value.substring(1);
    }

    //peek to log intermediate values for debugging
//    To allow us
//    to debug a stream element by element, as we might debug a loop step by step, a breakpoint
//    can be set on the body of the peek method.
//    In this case, peek can just have an empty body that you set a breakpoint in. Some debuggers
//    won’t let you set a breakpoint in an empty body, in which case I just map a value
//    to itself in order to be able to set the breakpoint. It’s not ideal, but it works fine.
    Set<String> nationalities
            = album.getMusicians()
            .filter(artist -> artist.getName().startsWith("The"))
            .map(artist -> artist.getNationality())
            .peek(nation -> System.out.println("Found nationality: " + nation))
            .collect(Collectors.<String>toSet());

}
*/
