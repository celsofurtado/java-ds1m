package conversor_temperatura;

public class ConverteCelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		double temperaturaCelsius = 32.0;
		
		double temperaturaFahrenheit;
		
		temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

		System.out.println(temperaturaCelsius + " graus Celsius equivale a " + temperaturaFahrenheit + " fahrenheit.");
		
	}

}
