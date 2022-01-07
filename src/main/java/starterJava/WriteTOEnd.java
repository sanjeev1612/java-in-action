package starterJava;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static starterJava.AVAILABLE.ABSENT;
import static starterJava.AVAILABLE.PRESENT;

public class WriteTOEnd {
  @SneakyThrows
  public static void main(String[] args) {
    var fileName = new File("/Users/sanjeev/IdeaProjects/javaPractice/src/main/java/starterJava/Sanjeev3.txt");
    if (fileName.isFile()) {
      System.out.println("File is " + PRESENT.getName());
    } else {
      System.out.println("File is " + ABSENT.getName() + " creating one ... ");
      boolean isFileCreated = false;
      try {
        isFileCreated = fileName.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (isFileCreated) {
        try (FileReader fr = new FileReader("/Users/sanjeev/IdeaProjects/javaPractice/src/main/java/starterJava/bands.txt");
             FileWriter rw = new FileWriter(fileName.getAbsolutePath())) {
          int content;
          while ((content = fr.read()) != -1) {
            rw.append((char) content);
          }
          rw.append("\nSanjeev Ranjan");
        }
      } else {
        System.out.println("sorry exiting application ");
      }
    }
    System.out.println("process completed ....");
  }
}
