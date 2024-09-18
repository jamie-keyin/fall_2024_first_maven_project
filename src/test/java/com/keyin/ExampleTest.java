package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ExampleTest {

    @Test
    public void testGetTodaysDate() {
        Example exampleUnderTest = new Example();

        Assertions.assertEquals(new Date(), exampleUnderTest.getTodaysDate());
    }

}
