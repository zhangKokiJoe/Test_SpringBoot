package cn.zhang.pro.controller;

import cn.zhang.pro.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {

    @Autowired
    Book book;

    @GetMapping("/book")
    public Book book() {
        Book book = new Book();
        book.setName("张000");
        book.setAuthor("王大招");
        book.setPrice(88F);
        book.setPublicationDate(new Date());

        return book;
    }
}
