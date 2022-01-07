package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.entity.Book;
import springboot.error.BookNotFoundException;
import springboot.repository.LibraryRepository;

import java.util.List;

@Service
public class LibraryService {

  @Autowired
  private LibraryRepository libraryRepository;

  public void addBook(Book book) {
    libraryRepository.save(book);
  }

  public List<Book> getBooks() {
    return libraryRepository.findAll();
  }

  public void deleteBook(Long bookId) {
    var book = libraryRepository.findById(bookId).get();
    libraryRepository.delete(book);
  }

  public Book getBookById(Long bookId) throws BookNotFoundException {
    var book = libraryRepository.findById(bookId);
    if (!book.isPresent()) {
      throw new BookNotFoundException("Book with id not found " + bookId);
    } else
      return book.get();
  }
}
