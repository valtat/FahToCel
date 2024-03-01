package org.example;

import static org.junit.jupiter.api.Assertions.*;

class KelvinToFahrenheitTest {

    @org.junit.jupiter.api.Test
    void kelvintoFah() {
        assertEquals(59.0, KelvinToFahrenheit.kelvintoFah(300.1));
    }

}