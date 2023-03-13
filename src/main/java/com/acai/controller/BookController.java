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
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : flag, Code.SAVE_OK);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : flag, Code.UPDATE_ERR);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : flag, Code.DELETE_ERR);
    }

    @GetMapping("/{id}")
    public Result getBuId(@PathVariable Integer id) {
        int a = 1 / 0;
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据获取失败，请重试";
        return new Result(book, code, msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> list = bookService.getAll();
        Integer code = list.size() != 0 ? Code.GET_OK : Code.GET_ERR;
        String msg = list.size() != 0 ? "" : "数据获取失败，请重试";
        return new Result(list, code, msg);
    }

}
