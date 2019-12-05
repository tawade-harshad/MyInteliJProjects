package com.jpmc.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {
    public static void main(String[] args) {

        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

//        Employee s = (Employee) factory.getBean("ec");
//        s.showJobRoles();

        Employee s1 = (Employee) factory.getBean("ec1");
        s1.showJobOpening();
    }
}
