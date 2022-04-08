package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springq1.xml");

        // using the setter injection
        Customer customer=(Customer) context.getBean("customer");
        customer.customerDetail();

        // using constructor injection
        Customer consCustomer=(Customer) context.getBean("consCustomer");
        consCustomer.customerDetail();
        
        
    }
}