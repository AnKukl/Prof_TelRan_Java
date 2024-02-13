package com.proftelran.org.lessontwentyfour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();
    @BeforeEach
    private  void init(){
        calculator = new Calculator();
        System.out.println("Call method init");
    }


    @Test
    public void testAdd() {
        int expectedResult = 10;
        int realResult = calculator.add(5,5);
        assertEquals(expectedResult, realResult, "5 + 5 = 10");
    }

    @Test
    public void testSub() {
        assertEquals(4,calculator.sub(6,2));
    }

    @AfterEach
    private void destroy(){
        calculator = null;
        System.out.println("Call destroy method");
    }

}