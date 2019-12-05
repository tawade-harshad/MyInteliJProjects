package com.training.beans;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@Alternative
public class DiscountService implements Service{

    public double findDiscount(Book bk){
        double discount = 0.10;

        if(bk.getBookName().startsWith("Head")){
            discount=0.15;
        }

            return discount;
    }
}
