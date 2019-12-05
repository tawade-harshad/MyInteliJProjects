package com.training.beans;

public class Application {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        System.out.println(bookManager.getDetails());
    }
}
