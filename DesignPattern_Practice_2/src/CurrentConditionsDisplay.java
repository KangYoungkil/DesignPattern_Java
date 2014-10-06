public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature, humidity,windSpeed;
	private Subject weatherData; // 이 클래스에서 사용되지 않으나 “탈퇴”시 필요

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float h, float p) {
		temperature = t;
		humidity = h;
		display();
	}

	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
	public void update(float t, float h, float p,
			float w) {
		windSpeed = w;
		update(t,h,p);
		// TODO Auto-generated method stub
		
	}
}