package com.tjs.persons.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDAOConfig.class);
        DataSource bean = context.getBean(DataSource.class);

    }
}
