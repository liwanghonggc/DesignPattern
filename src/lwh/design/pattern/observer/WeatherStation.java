package lwh.design.pattern.observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30.42f);
    }
}
