package com.training.beans;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@Default
public class FestivalDiscount implements Service{

    @Override
    public double findDiscount(Book book) {
        double discount = 0.20;

        if(book.getBookName().startsWith("Head")){
            discount=0.25;
        }

        return discount;
    }
}
