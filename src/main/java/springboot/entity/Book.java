package springboot.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long bookId;
  private String bookName;
  private Integer noOfPages;
  private Double mrp;
}
