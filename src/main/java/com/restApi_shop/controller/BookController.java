package com.restApi_shop.controller;

import com.restApi_shop.entity.Book;
import com.restApi_shop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/products")
    public List<Book> listBooks(){
        return bookService.listOfBooks();
    }


    @GetMapping("/products/{id}")
    public ResponseEntity<Book> getProduct(@PathVariable Long id ){
        try{
            Book book = bookService.getBookById(id);
            return new ResponseEntity<Book>(book, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/products")
    public void saveBook(@RequestBody Book book){
        bookService.saveProduct(book);
    }

    /**
     * ResponseEntity <?> means that it will return any kind of data
     * */

    @PutMapping("/products/{id}")
    public ResponseEntity<?> updateBook(@RequestBody Book book, @PathVariable Long id){
       try{
           Book existingBook = bookService.getBookById(id);
           bookService.saveProduct(book);
           return new ResponseEntity<Book>(HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
       }
    }


    @DeleteMapping("/book/{id}")
    public void deleteBookById(@PathVariable Long id){
        bookService.deleteProduct(id);
    }
}
