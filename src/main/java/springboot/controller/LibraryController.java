package springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.entity.Book;
import springboot.error.BookNotFoundException;
import springboot.service.LibraryService;

import java.util.List;

@RestController
public class LibraryController {

  @Autowired
  private LibraryService libraryService;

  @PostMapping("/add")
  public String addBook(@RequestBody Book book) {
    libraryService.addBook(book);
    return "Added Book Successfully";
  }

  @GetMapping("/findAll")
  public List<Book> getBooks(){
    return libraryService.getBooks();
  }

  @DeleteMapping("/delete/{id}")
  public String getBooks(@PathVariable("id") Long bookId){
     libraryService.deleteBook(bookId);
     return "Book with id deleted successfully "+bookId;
  }

  @GetMapping("/findById/{id}")
  public Book getBookById(@PathVariable("id") Long bookId) throws BookNotFoundException {
    return libraryService.getBookById(bookId);
  }
}
