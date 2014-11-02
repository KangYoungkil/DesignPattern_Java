
public class PancakeHouseMenu extends Menu
{
	public PancakeHouseMenu(String name, String description)
	{
		super(name, description);
		add(new MenuItem("K&B 팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", 2.99));
		add(new MenuItem("레귤러 팬케이크 세트", "달걀 후아리와 소시지가 곁들여진 팬케이", 2.99));
		add(new MenuItem("블루베리 팬케이", "신선한 블루베리와 블루베리 시럽으로 만든 케이크", 3.49));
		add(new MenuItem("와플", "와플, 취향에 따라 블루베리나 딸기를 얹을 수 있습니다.", 3.59));
	}
}