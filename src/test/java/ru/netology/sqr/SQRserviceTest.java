package ru.netology.sqr;

import  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRserviceTest {

    @Test
    public void souldCalculate() {
        SQRservice service = new SQRservice();
        int squareNumber = 99;
        int number = 10;

        int actual = service.calculate(squareNumber);

        assertEquals(number, actual);
    }
}