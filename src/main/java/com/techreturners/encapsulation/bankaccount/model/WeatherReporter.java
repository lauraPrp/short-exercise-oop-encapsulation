package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;



    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    private double convertCelsiusToFahreneit(double temp) {
        final double CTF = 1.8;
        final int CELSIUS_TO_FAHRENHEIT = 32;
        return CTF * temp + CELSIUS_TO_FAHRENHEIT;
    }


    public String print() {
        return MessageFormat.format("I am in {0} and it is {1}. {2} The temperature in Fahrenheit is {3}.",
                location, checkLocation(), checkTemperature(), convertCelsiusToFahreneit(temperature));

    }

    public String checkLocation() {
        final String LONDON = "London";
        final String CALIFORNIA = "California";
        final String CAPE_TOWN = "Cape Town";
        return switch (location) {
            case LONDON -> "🌦";
            case CALIFORNIA -> "🌅";
            case CAPE_TOWN -> "🌤";
            default -> "🔆";
        };
    }

    public String checkTemperature() {
       final int HOT_TEMP = 30;
       final  int COLD_TEMP = 10;
        if (temperature > HOT_TEMP) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_TEMP) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
