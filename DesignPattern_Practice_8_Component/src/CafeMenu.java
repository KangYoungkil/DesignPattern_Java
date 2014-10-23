public class CafeMenu extends Menu
{
	public CafeMenu(String name, String description)
	{
		super(name, description);
		add(new MenuItem("에스프레소", "커피의 진한향", 2.89));
		add(new MenuItem("아메리카노", "시럽시럽 뺴고 주세요", 2.99));
		add(new MenuItem("카페모카", "초코향을 좋아한다면", 3.09));
		add(new MenuItem("캬라멜 마끼아또", "달달한 걸 좋아한다면", 3.29));
	}
}