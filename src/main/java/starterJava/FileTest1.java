package starterJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        var file= Files.lines(Path.of("/Users/sanjeev/IdeaProjects/RxJavaPractice/src/main/java/starterJava/bands.txt"));
        /* file.sorted()
                .filter(a-> a.contains("jit"))
                .map(String::toUpperCase)
                .forEach(System.out::println); */

        file.sorted()
                .collect(Collectors.groupingBy(a->a.charAt(0)))
        .forEach((a,b)-> System.out.println(b));
    }
}
