
public class ForecastDisplay implements Observer, DisplayElement{

	float currentPressure;  
	float lastPressure;
	float currentWindSpeed;
	float lastWindSpeed;
	
	private Subject weatherData; // 이 클래스에서 사용되지 않으나 “탈퇴”시 필요

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float h, float p) {
		lastPressure = currentPressure;
		currentPressure = p;
		display();
	}

	public void display() {
		System.out.println("Forecast: ");
		if (currentPressure > lastPressure) 
			System.out.println("Improving weather on the way!");
		else if (currentPressure == lastPressure) 
			System.out.println("More of the same");
		else if (currentPressure < lastPressure) 
			System.out.println("Watch out for cooler, rainy weather");
	}

	public void update(float t, float h, float p,
			float w) {
		lastWindSpeed = currentWindSpeed;
		currentWindSpeed = w;
		update(t,h,p);
	}
}
