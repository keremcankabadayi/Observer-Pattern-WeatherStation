package CustomImplemantation;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject WeatherData;

	public StatisticsDisplay(Subject WeatherData) {
		// TODO Auto-generated constructor stub
		this.WeatherData = WeatherData;
		this.WeatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub

		this.tempSum = ++temperature;
		this.numReadings++;

		if (temperature > this.maxTemp) {
			this.maxTemp = temperature;
		} else if (temperature < this.minTemp) {
			this.minTemp = temperature;
		}
		this.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min temperature = " + this.tempSum / this.numReadings + "/" + this.maxTemp + "/"
				+ this.minTemp);
	}

}
