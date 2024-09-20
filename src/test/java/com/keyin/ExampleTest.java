package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class ExampleTest {

    @Test
    public void testGetTodaysDate() {
        Example exampleUnderTest = new Example();

        Assertions.assertEquals(new Date(), exampleUnderTest.getTodaysDate());
    }

    @Test
    public void testGetCurrentMonth() {
        Example exampleUnderTest = new Example();

        Assertions.assertEquals(Calendar.getInstance().get(Calendar.MONTH), exampleUnderTest.getCurrentMonth());
    }

}
