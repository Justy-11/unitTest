package com.jathursh.demo.service;

public class ExternalService {

    public String getValidationData(String id){
        return "actual data for validation";
    }

    void someMethod() throws RuntimeException{
        System.out.println("doing nothing..");
    }
}
