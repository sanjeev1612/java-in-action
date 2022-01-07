package starterJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class RiteshDemo {
  public static void main(String[] args) throws IOException {
    List<String> bands2 = Files.lines(Paths.get("/Users/sanjeev/IdeaProjects/javaPractice/src/main/java/starterJava/bands.txt"))
            .filter(x -> x.contains("jit"))
            .collect(Collectors.toList());
    bands2.forEach(x -> System.out.println(x));
  }
}
