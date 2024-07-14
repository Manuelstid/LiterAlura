package com.example.bookcatalog.repository;

import com.pardo.bookcatalog.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByLanguage(String language);
}

