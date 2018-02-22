package CustomImplemantation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature, humidity;
	private Subject WeatherData;

	public CurrentConditionsDisplay(Subject WeatherData) {
		// TODO Auto-generated constructor stub
		this.WeatherData = WeatherData;
		this.WeatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

}
