package controller;

import com.pardo.bookcatalog.model.Book;
import com.pardo.bookcatalog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/title/{title}")
    public List<Book> findBooksByTitle(@PathVariable String title) {
        return bookService.findBooksByTitle(title);
    }

    @GetMapping
    public List<Book> listAllBooks() {
        return bookService.listAllBooks();
    }

    @GetMapping("/language/{language}")
    public List<Book> listBooksByLanguage(@PathVariable String language) {
        return bookService.listBooksByLanguage(language);
    }
}

