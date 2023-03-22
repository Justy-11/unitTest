package com.jathursh.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// added on 21/3/2023
// Test class - must not be abstract, must have a single constructor
// Test order
//@TestMethodOrder(MethodOrderer.Alphanumeric.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)  //per class lifecycle method
/*@TestInstance(TestInstance.Lifecycle.PER_CLASS) and @TestInstance(TestInstance.Lifecycle.PER_METHOD) are annotations used in JUnit 5 to specify the lifecycle of test instances.
@TestInstance(TestInstance.Lifecycle.PER_CLASS) means that a single test instance will be created for the entire test class. This means that the same instance of the test class will be used to execute all test methods in the class. This can be useful when you have expensive setup or teardown logic that you want to execute only once for all test methods in the class.
@TestInstance(TestInstance.Lifecycle.PER_METHOD) means that a new test instance will be created for each test method. This means that a new instance of the test class will be created and used to execute each test method in the class. This can be useful when you want to ensure that each test method is executed in a clean environment, without any state left over from previous test methods.
It's worth noting that the default behavior in JUnit 5 is @TestInstance(TestInstance.Lifecycle.PER_METHOD), so you don't need to specify it explicitly unless you want to change the default behavior. */
class DemoTest {

    public DemoTest(){
        System.out.println("test instance");
    }

    @BeforeEach
    void setup(){
        System.out.println("Before each");
    }

    @Test
    @Order(1)
    void saySomething() {
        String expected  = "something";
        Demo demo = new Demo();
        String actual =  demo.saySomething();
        assertEquals(expected, actual,"not equal");
    }

    @Test
    @Order(2)
    void currentlyInfectedPeople() {
        Demo demo = new Demo();
        int expected = 150100;
        int actual = demo.currentlyInfectedPeople(100);
        assertEquals(expected, actual);
    }


    @AfterEach
    void teardown(){
        System.out.println("After each");
    }

}