package com.training.beans;

import com.training.annotations.SampleBook;

import javax.inject.Inject;
import java.lang.annotation.Annotation;

public class BookManager {


    @Inject
    private Service service;

    public double findPrice(Book book){

        double discountPercentage = service.findDiscount(book);
        double netAmount = book.getPrice() - (book.getPrice()* discountPercentage);

        return netAmount;
    }

    public String getDetails(){
        Book book = new Book();

        if(book.getBookName() == null) {
            Class clsRef = book.getClass();
            Annotation annotate = clsRef.getAnnotation(SampleBook.class);

            long bookId = ((SampleBook) annotate).id();
            String bookName = ((SampleBook) annotate).name();
            double price = ((SampleBook) annotate).price();

            book.setBookId(bookId);
            book.setBookName(bookName);
            book.setPrice(price);

            return book.toString();
        }
        else{
            return book.toString();
        }
    }
}
