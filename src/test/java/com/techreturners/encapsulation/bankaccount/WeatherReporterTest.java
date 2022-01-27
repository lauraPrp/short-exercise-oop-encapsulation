package com.techreturners.encapsulation.bankaccount;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.Test;


public class WeatherReporterTest {

    @Test
    public void checkColdWeather() {
        WeatherReporter wr = new WeatherReporter("London",4.0);
        WeatherReporter wr2 = new WeatherReporter("California",-2.0);
        WeatherReporter wr3 = new WeatherReporter("Cape Town",0.0);
        assertEquals("I am in London and it is 🌦. It's too cold 🥶! The temperature in Fahrenheit is 39.2.",wr.print());
        assertEquals("I am in California and it is 🌅. It's too cold 🥶! The temperature in Fahrenheit is 28.4.",wr2.print());
        assertEquals("I am in Cape Town and it is 🌤. It's too cold 🥶! The temperature in Fahrenheit is 32.",wr3.print());


        }
    @Test
    public void checkHotWeather() {
        WeatherReporter wr = new WeatherReporter("London",35);
        WeatherReporter wr2 = new WeatherReporter("California",40);
        WeatherReporter wr3 = new WeatherReporter("Cape Town",38);
        assertEquals("I am in London and it is 🌦. It's too hot 🥵! The temperature in Fahrenheit is 95.",wr.print());
        assertEquals("I am in California and it is 🌅. It's too hot 🥵! The temperature in Fahrenheit is 104.",wr2.print());
        assertEquals("I am in Cape Town and it is 🌤. It's too hot 🥵! The temperature in Fahrenheit is 100.4.",wr3.print());

    }
    @Test
    public void checkRightWeather() {
        WeatherReporter wr = new WeatherReporter("London",15);
        WeatherReporter wr2 = new WeatherReporter("California",20);
        WeatherReporter wr3 = new WeatherReporter("Cape Town",18);

        assertEquals("I am in London and it is 🌦. Ahhh...it's just right 😊! The temperature in Fahrenheit is 59.",wr.print());
        assertEquals("I am in California and it is 🌅. Ahhh...it's just right 😊! The temperature in Fahrenheit is 68.",wr2.print());
        assertEquals("I am in Cape Town and it is 🌤. Ahhh...it's just right 😊! The temperature in Fahrenheit is 64.4.",wr3.print());


    }
    @Test
    public void checkExtremeWeather() {
        WeatherReporter wr = new WeatherReporter("London",Double.MIN_VALUE);
        WeatherReporter wr2 = new WeatherReporter("California",Double.MAX_VALUE+2);
        WeatherReporter wr3 = new WeatherReporter("Cape Town",Double.NEGATIVE_INFINITY-3.0);

        assertEquals("I am in London and it is 🌦. It's too cold 🥶! The temperature in Fahrenheit is 32.",wr.print());
        assertEquals("I am in California and it is 🌅. It's too hot 🥵! The temperature in Fahrenheit is ∞.",wr2.print());
        assertEquals("I am in Cape Town and it is 🌤. It's too cold 🥶! The temperature in Fahrenheit is -∞.",wr3.print());

    }
}
