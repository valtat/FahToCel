package org.example;

public class FahrenheitToCelsius {

    public static float convert(float fahrenheit) {
        float celsius = (float) ((fahrenheit - 32) * 5/9);
        return Math.round(celsius);
    }
}
