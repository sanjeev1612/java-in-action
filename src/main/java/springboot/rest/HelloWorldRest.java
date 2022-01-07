package springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
public class HelloWorldRest {

  @GetMapping("/welcome")
  public String callRestEndPoint() throws URISyntaxException {
    return "First Restful API Hello is a Rahul....";
  }
}
