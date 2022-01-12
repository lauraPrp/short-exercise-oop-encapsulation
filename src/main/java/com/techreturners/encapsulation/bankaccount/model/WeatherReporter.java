package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    public final String LONDON = "London";
    public final String CALIFORNIA = "California";
    public final String CAPE_TOWN = "Cape Town";

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
                location, check1(), check2(), convertCelsiusToFahreneit(temperature));

    }

    public String check1() {
        return switch (location) {
            case LONDON -> "🌦";
            case CALIFORNIA -> "🌅";
            case CAPE_TOWN -> "🌤";
            default -> "🔆";
        };
    }

    public String check2() {
        int HOT_TEMP = 30;
        int COLD_TEMP = 10;
        if (temperature > HOT_TEMP) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_TEMP) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
