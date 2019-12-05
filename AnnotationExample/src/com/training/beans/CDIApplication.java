package com.training.beans;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class CDIApplication {

    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        BookManager mgr = container.instance().select(BookManager.class).get();

        System.out.println(mgr.findPrice
                (new Book
                        (1203,"Head First Java", 450)));

    }
}
