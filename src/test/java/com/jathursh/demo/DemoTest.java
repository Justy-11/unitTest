package com.jathursh.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// added on 21/3/2023
// Test class - must not be abstract, must have a single constructor
class DemoTest {

    @Test
    void saySomething() {
        String expected  = "something";
        Demo demo = new Demo();
        String actual =  demo.saySomething();
        assertEquals(expected, actual,"not equal");
    }

    @Test
    void currentlyInfectedPeople() {
        Demo demo = new Demo();
        int expected = 150100;
        int actual = demo.currentlyInfectedPeople(100);
        assertEquals(expected, actual);
    }


}