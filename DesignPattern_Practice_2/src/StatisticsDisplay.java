
public class StatisticsDisplay implements Observer, DisplayElement{

	private Subject weatherData; // 이 클래스에서 사용되지 않으나 “탈퇴”시 필요
	float maxTemp;
	float minTemp;
	float tempSum;
	int numReadings;
	
	float minWindSpeed;
	float maxWindSpeed;
	float windSpeedSum;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float h, float p,float w) {
		update(w);
		update(t,h,p);
	}

	public void display() {
		System.out.printf("Avg/Max/Min temperature = %f / %f/ %f\n",(tempSum / numReadings),maxTemp,minTemp);
		System.out.printf("Avg/Max/Min windSpeed = %f / %f/ %f\n",(windSpeedSum / numReadings),maxWindSpeed,minWindSpeed);
	}

	public void update(float w) {
		// TODO Auto-generated method stub
		if(w > maxWindSpeed)
			maxWindSpeed = w;
		
		if(w < minWindSpeed)
			minWindSpeed = w;
		
		windSpeedSum+=w;
	}

	public void update(float t, float h, float p) {
		tempSum += t;
		numReadings++;
		if (t > maxTemp) {
			maxTemp = t;
		}

		if (t < minTemp) {
			minTemp = t;
		}
		display();
	}
}
