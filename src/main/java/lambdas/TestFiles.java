package lambdas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TestFiles {

    public static void main(String[] args) {
//        try {
//            Files.list(Paths.get("."))
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("***************");
//        try {
//            Files.list(Paths.get("."))
//                    .filter(Files::isDirectory)
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("*******************");
//        try {
//            Files.newDirectoryStream(
//                    Paths.get("fpij"), path -> path.toString().endsWith(".java"))
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //final File[] files = new File(".").listFiles(file -> file.isHidden());
        //new File(".").listFiles(File::isHidden);

//        List<File> files =
//                Stream.of(new File(".").listFiles())
//                        .flatMap(file -> file.listFiles() == null ?
//                                Stream.of(file) : Stream.of(file.listFiles()))
//                        .collect(toList());
//        files.forEach(System.out::println);
//        System.out.println("Count: " + files.size());




    }
}
