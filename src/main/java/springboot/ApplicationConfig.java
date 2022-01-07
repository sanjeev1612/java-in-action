package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Date;


@EnableScheduling
@SpringBootApplication
public class ApplicationConfig {

  public static void main(String[] args) throws IOException {
    SpringApplication.run(ApplicationConfig.class, args);
    System.out.println("---------- MAIN APPLICATION STARTED -------------");
  }

  @Bean
  RestTemplate getRestTemplate() {
    return new RestTemplate();
  }

  @Scheduled(fixedRate = 50000)
  public void printHello(){
    System.out.println("Hello Time is "+new Date().toString());
  }
}
