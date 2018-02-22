package CustomImplemantation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData WeatherData = new WeatherData();

		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(WeatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(WeatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(WeatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(WeatherData);

		WeatherData.setMeasurement(80, 100, 30.4f);
		System.out.println("------------");
		WeatherData.setMeasurement(82, 50, 29.2f);
		System.out.println("------------");
		WeatherData.setMeasurement(78, 10, 29.2f);

	}

}
