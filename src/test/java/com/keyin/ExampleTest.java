package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Calendar;
import java.util.Date;

@ExtendWith(MockitoExtension.class)
public class ExampleTest {
    @Mock
    private DataSource dataSourceMock = new DataSource();


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

    @Test
    public void testDataSourceName() {
        Example exampleUnderTest = new Example();

        exampleUnderTest.setDataSource(dataSourceMock);

        Mockito.when(dataSourceMock.getDataSourceName()).thenReturn("TestDataSource");

        Assertions.assertEquals("TestDataSource", exampleUnderTest.getDataSourceName());
    }

}
