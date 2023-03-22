package com.jathursh.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


/*@TempDir is a JUnit 5 annotation that can be used to provide a temporary directory for a test method. It is typically used to create and work with temporary files
 and directories during testing.*/
public class TimeDirDemoTest {

    // @Test
    // OR
    @FastTest  //annotation in FastTest.java
    void testCase1(@TempDir Path fileDir) throws IOException {

        Path file = fileDir.resolve("abc.txt");

        String description = "this is Jathursh";

        Files.write(file, description.getBytes());

        List<String> actualData = Files.readAllLines(file);
        List<String> expectedData = Collections.singletonList(description);

        assertEquals(expectedData, actualData);

    }
}
