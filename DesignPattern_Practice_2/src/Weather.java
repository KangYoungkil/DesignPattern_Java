
public class Weather {
	public float 온도, 습도, 풍속, 기압;
	public Weather(float t, float h, float p,float w) {
		온도 = t;
		습도 = h;
		풍속 = w;
		기압 = p;
	}
	public Weather(float t, float h, float p) {
		온도 = t;
		습도 = h;
		기압 = p;
	}
	public void show()
	{
		System.out.println("온도 : "+온도 +"  습도 : "+습도 +"  기압 : " + 기압 + "  풍속 : " + 풍속);
	}
}
