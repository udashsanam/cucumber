package com.learn.cucumbertest.service;

public class MyService extends Upper{

    public String process(String input) {
        // You want to mock this call
       helperMethod(input);
        helperMethod(input);
        System.out.println(x.getParam("hello"));

        System.out.println("hello");
        return "Processed: " + "null";
    }


    @Override
    protected void helperMethod(String value) {
        super.helperMethod(value);
    }
}
