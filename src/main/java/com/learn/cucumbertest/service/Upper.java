package com.learn.cucumbertest.service;

public abstract class Upper {

    protected MyClass  x;
    protected void helperMethod(String value) {
        System.out.println("hello");
        System.out.println(value.toUpperCase()); // This method you want to mock
    }
}
