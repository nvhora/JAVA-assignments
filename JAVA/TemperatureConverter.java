
public class TemperatureConverter {
	public static double celsiusTofahrenheit(double celsius){
		return(celsius *9/5)+32;
	}
	public static double fahrenheitToCelsius(double fahrenheit){
		return(fahrenheit-32)*5/9;
	}

	public static void main(String[] args) {
		double celsiusTemperature=25.50;
		double fahrenheitTemperature = celsiusTofahrenheit(celsiusTemperature);
		System.out.println(celsiusTemperature +" celsius is equal to "+fahrenheitTemperature+" fahrenheit ");
		
		double newFahrenheitTemperature=78;
		double newCelsiusTemperature=fahrenheitToCelsius(newFahrenheitTemperature);
		System.out.println(newFahrenheitTemperature +" Fahrenheit is equivalent to "+ newCelsiusTemperature + " Celsius");
	}
}