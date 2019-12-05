package com.jpmc.aggregateandcomposition;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class MainClass {
    public static void main(String[] args) {

        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

 /*     Employee s = (Employee) factory.getBean("e");
        s.show();
        s.show1();*/

        Employee s1 = (Employee) factory.getBean("e1");
        s1.show1();
    }
}
