package com.yc.springcloud81.misprovider.controller;

import com.yc.springcloud81.misprovider.bean.Book;
import com.yc.springcloud81.misprovider.servies.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    public BookService bookService;

    @GetMapping("{id}")
    public Book getBook(@PathVariable("id")Integer id){
        return bookService.getBook(id);
    }
}
