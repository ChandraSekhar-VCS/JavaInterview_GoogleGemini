package Assignment_6;

public class Test {
    public static void main(String[] args) {
        double temperature = 100;
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double converted = temperatureConverter.celsiusToFahrenheit(temperature);
        System.out.println(converted);
    }
}
