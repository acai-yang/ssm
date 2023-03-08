package com.acai.controller;

import com.acai.dao.BookDao;
import com.acai.domain.Book;
import com.acai.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月08日 16:23
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping()
    public boolean save(@RequestBody Book book) {
        bookService.save(book);
        return true;
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        bookService.update(book);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        bookService.delete(id);
        return true;
    }

    @GetMapping("/{id}")
    public Book getBuId(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

}
