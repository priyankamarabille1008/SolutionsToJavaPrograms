package Assesments;
// import java.lang.annotation.Retention;
class TemperatureConverter {
    public double convertFahrenheitToCelsius(double f) {
        double c = (f - 32) * 5 / 9;
        return c;
    }
}

public class Assesment6 {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        double rs = tc.convertFahrenheitToCelsius(68.0);
        System.out.println(String.format("%,.2f", rs));
    }

}
