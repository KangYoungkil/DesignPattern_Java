public class DinerMenu extends Menu
{
	public DinerMenu(String name, String description)
	{
		super(name, description);
		add(new MenuItem("채식주의자용  BLT", "통밀 위에(식물성)베이컨, 상추, 토마토를 얹은 메뉴", 2.99));
		add(new MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", 2.99));
		add(new MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", 3.29));
		add(new MenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", 3.05));
		add(new MenuItem("Pasta", "파스타", 3.89));
	}
}