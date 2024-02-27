package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitToCelsiusTest {

    @Test
    void testConvert() {
        assertEquals(0, FahrenheitToCelsius.convert(32));
        assertEquals(100, FahrenheitToCelsius.convert(212));
        assertEquals(37, FahrenheitToCelsius.convert(98.6f));
        assertEquals(25, FahrenheitToCelsius.convert(77));
    }

}