package starterJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class FileTest2 {
  public static void main(String[] args) throws IOException {
    var file = Files.lines(Path.of("/Users/sanjeev/IdeaProjects/RxJavaPractice/src/main/java/starterJava/data.txt"));

        file
        .map(a -> a.split(","))
        .filter(a -> a.length == 3)
        .collect(Collectors.toMap(a -> a[0], a -> a[1]))
        .forEach((k, v) -> System.out.println("Key is " + k + " value is " + v));
  }
}
