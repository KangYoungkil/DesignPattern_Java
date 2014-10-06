import java.util.ArrayList;

public class PastDisplay implements Observer, DisplayElement {
	ArrayList<Weather> wList;
	private Subject weatherData; // 이 클래스에서 사용되지 않으나 “탈퇴”시 필요

	public PastDisplay() {
		wList = new ArrayList<Weather>();
	}

	public void registerWeather(Weather w) {
		wList.add(w);
	} // observer 등록

	public void notifyState() {
		for (Weather w : wList)
			w.show();
	}

	public PastDisplay(Subject weatherData) {
		wList = new ArrayList<Weather>();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void setMeasurements(float t, float h, float p, float w) {
		registerWeather(new Weather(t, h, p, w));
		measurementsChanged();
	}

	public void measurementsChanged() { // WeatherData: observer들에게 변경 사항을 통지함.
		notifyState();
	}

	public void display() {
		System.out.println("PastDisplay ..." );
	}

	public void update(float t, float h, float p) {
		display();
		registerWeather(new Weather(t, h, p));
		measurementsChanged();

	}

	public void update(float t, float h, float p, float w) {
		display();
		registerWeather(new Weather(t, h, p, w));
		measurementsChanged();
	}

}
