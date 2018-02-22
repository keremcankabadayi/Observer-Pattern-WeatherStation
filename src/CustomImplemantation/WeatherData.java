package CustomImplemantation;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature, humidity, pressure;

	public WeatherData() {
		// TODO Auto-generated constructor stub
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer newObserver) {
		// TODO Auto-generated method stub
		this.observers.add(newObserver);
	}

	@Override
	public void unregisterObserver(Observer removeObserver) {
		// TODO Auto-generated method stub
		int i = this.observers.indexOf(removeObserver);
		if (i >= 0) {
			this.observers.remove(i);
		}

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.observers.size(); i++) {
			Observer observer = this.observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}

	public void measurementChanged() {
		// TODO Auto-generated method stub
		this.notifyObserver();
	}

	public void setMeasurement(float temperature, float humidity, float pressure) {

		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementChanged();
	}

	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}

	public float getPressure() {
		return this.pressure;
	}

}
