package com.jathursh.demo.service;

public class MyService {

    ExternalService externalService;

    public MyService(ExternalService externalService) {
        this.externalService = externalService;
    }

    public boolean validate(String id){
        if(id ==null){
            throw new RuntimeException("id is null");
        }
        return externalService.getValidationData(id) != null;
    }
}
