package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KelvinToCelsiusTest {

    @Test
    void testKelvintoCel() {

        assertEquals(0, KelvinToCelsius.kelvintoCel(273.15f), 0.00001f);
        assertEquals(100, KelvinToCelsius.kelvintoCel(373.15f), 0.00001f);
        assertEquals(37, KelvinToCelsius.kelvintoCel(310.15f), 0.00001f);
        assertEquals(25, KelvinToCelsius.kelvintoCel(298.15f), 0.00001f);
    }
    
}
