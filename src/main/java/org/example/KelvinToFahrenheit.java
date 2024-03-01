package org.example;

public class KelvinToFahrenheit {

    public static double kelvintoFah(double kel){
        double fahrenheit = ((kel - 273.15) * (9 / 5) + 32);
        return Math.round(fahrenheit);
    }

}
