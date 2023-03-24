package com.restApi_shop.service;

import com.restApi_shop.entity.Book;
import com.restApi_shop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> listOfBooks(){
        return bookRepository.findAll();
    }

    public void saveProduct(Book book){
        bookRepository.save(book);
    }

    public Book getBookById(Long id){
        return bookRepository.findById(id).get();
    }

    public void deleteProduct(Long id){
        bookRepository.deleteById(id);
    }
}
