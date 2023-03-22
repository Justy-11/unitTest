# 🧪 Unit Testing with JUnit5 and Mockito

## 🟢 JUnit5
JUnit5 is the latest version of the popular JUnit testing framework for Java. It comes with several features that make it easy to write and run unit tests.

### 🔄 *Lifecycle methods*
JUnit5 provides several lifecycle methods that can be used to manage the setup and teardown of test cases. These methods include `@BeforeEach`, `@BeforeAll`, `@AfterEach`, and `@AfterAll`. `@BeforeEach` and `@BeforeAll` are used to setup test fixtures before each test case and before all test cases, respectively. `@AfterEach` and `@AfterAll` are used to tear down test fixtures after each test case and after all test cases, respectively.

### ❗ *Testing for exceptions and timeouts*
JUnit5 provides built-in support for testing exceptions and timeouts. The `@Test` annotation can be used to specify the expected exception for a test case. Similarly, the `@Timeout` annotation can be used to specify a timeout period for a test case.

### 🎯 *Assertions*
JUnit5 comes with several built-in assertion methods that can be used to test for expected outcomes. These methods include `assertTrue`, `assertFalse`, `assertEquals`, `assertNotEquals`, `assertNull`, and `assertNotNull`, among others.

### 🎁 *Nested classes*
JUnit5 allows you to define nested test classes. This can be useful for organizing related test cases and reducing code duplication.

### 🔁 *Repeated tests*
JUnit5 provides built-in support for repeating test cases. The `@RepeatedTest` annotation can be used to specify the number of times a test case should be repeated.

### 📝 *Parameterized tests*
JUnit5 provides built-in support for parameterized tests. This can be useful for testing the same code with different input values. The `@ParameterizedTest` annotation can be used to specify the input values for a test case.

### 🔀 *Test ordering and Test instance for lifecycle methods*
JUnit5 allows you to specify the order in which test cases are executed using the `@Order` annotation. Additionally, you can control the lifecycle of test instances using the `@TestInstance` annotation.

### 🏷️ *Tagging and filtering in Gradle*
JUnit5 provides support for tagging test cases and filtering them based on tags. This can be useful for running specific subsets of test cases. Gradle provides built-in support for tagging and filtering test cases.

## 🃏 Mockito
Mockito is a popular mocking framework for Java. It allows you to create mock objects and stub their behavior during testing.

## 📈 Code Coverage with Jacoco
Code coverage is a metric that measures the percentage of code that is executed during testing. Jacoco is a popular library for measuring code coverage in Java.

## 🔍 SonarQube
SonarQube is an open-source platform for managing code quality. It provides a range of tools for measuring code quality metrics, including code coverage.

## 🐛 Mutation testing
Mutation testing is a technique for testing the effectiveness of a test suite. It involves making small changes to the code and checking if the test suite detects those changes. Several mutation testing frameworks are available for Java, including Pitest and Javalanche.

## 🤝 Integration testing
Integration testing is a type of testing that focuses on testing the interactions between different parts of a system. It can be useful for identifying issues that may arise when different components are combined.
