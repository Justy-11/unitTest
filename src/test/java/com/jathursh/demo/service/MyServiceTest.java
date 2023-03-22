package com.jathursh.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

//@ExtendWith(Mockito.class)
class MyServiceTest {

    MyService myService;

    @Mock
    ExternalService externalService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  //method that initializes annotated mocks and injects them into the object being tested. It is used in conjunction with the @Mock and @InjectMocks annotations.
        // below 2 as same as above
        /*externalService = Mockito.mock(ExternalService.class);
        myService = new MyService(externalService);*/

    }

    @Test
    void validate() {
        Mockito.when(externalService.getValidationData(anyString())).thenReturn("some-value");
        assertTrue(myService.validate("Ja"));
        Mockito.verify(externalService, Mockito.times(1)).getValidationData("Ja");
    }
}