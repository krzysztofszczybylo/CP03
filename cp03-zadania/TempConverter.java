
public class TempConverter
{
    double c;
    double f;
    double k;
    
    static double CelsiusToFahrenheit (double c){
        return (1.8 * c + 32);
    }
    
    static double CelsiusToKelvin (double c){
        return (c + 273.15);
    }
    
    static double FahrenheitToKelvin (double f){
        return (1.8 * (f-32) + 273.15);
    }
    
    static double FahrenheitToCelsius (double f){
        return ((f-32)/1.8);
    }
    
    static double KelvinToCelsius (double k){
        return (k - 273.15);
    }
    
    static double KelvinToFahrenheit (double k){
        return (1.8 * (k-273.5) + 32);
    }
    
    public static void main (String [] args){
        double c = 25;
        double f = 100;
        double k = 0;
        System.out.println(c + " Celsius degrees are " + CelsiusToKelvin(c) + " Kelvins and " + CelsiusToFahrenheit(c) + " Fahrenheit degrees.");
        System.out.println(f + " Fahrenheit degrees are " + FahrenheitToKelvin(f) + " Kelvins and " + FahrenheitToCelsius(f) + " Celsius degrees.");
        System.out.println(k + " Kelvins are " + KelvinToCelsius(k) + " Celsius degrees and " + KelvinToFahrenheit(k) + " Fahrenheit degrees.");
    }
}
