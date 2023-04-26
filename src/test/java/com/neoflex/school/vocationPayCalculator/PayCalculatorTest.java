package com.neoflex.school.vocationPayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayCalculatorTest {

    @Test
    void calculate() {
        assertEquals(10.0, PayCalculator.calculate(30.0, 10));
    }
}