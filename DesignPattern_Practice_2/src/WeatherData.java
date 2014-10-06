import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers; // observer list
	private float 온도, 습도, 기압; // subject 상태
	private float 풍속;
	public WeatherData() {observers = new ArrayList(); }
	public void registerObserver(Observer o) { observers.add(o); } // observer 등록
	public void removeObserver(Observer o) { int i = observers.indexOf(o); if (i>=0) {observers.remove(i);}}
	public void notifyObservers() 
	{
		for (Observer o : observers)
			o.update(온도, 습도, 기압,풍속);
	} //변경 통지

	public void setMeasurements(float t, float h, float p,float w) 
		{ //기상대: weatherData.setMeasurements(t, h, p)
			풍속 = w;
			setMeasurements(t,h,p);
		}
	public void setMeasurements(float t, float h, float p) 
	{ //기상대: weatherData.setMeasurements(t, h, p)
		온도 = t; 습도 = h; 기압 = p; 
		measurementsChanged();
	}
	public void measurementsChanged() 
		{ //WeatherData: observer들에게 변경 사항을 통지함.
			notifyObservers(); 
		}
	public float getTemperature() { return 온도; }
	public float getHumidity() { return 습도; }
	public float getPressure() { return 기압; }
	public float getWindSpeed(){return 풍속;}
}