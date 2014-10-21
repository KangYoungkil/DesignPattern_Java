
public class KoreaWildTurkey extends WildTurkey implements KoreaTurkey{
	public void gobble() {
		System.out.println("꿱꿱");
	}

	public void fly() {
		System.out.println("조금 더 날아");
	}
	public void gobble(int n) {
		for(int i=0;i<n;i++)
			System.out.println("꿱꿱");
	}

	public void fly(int n) {
		for(int i=0;i<n;i++)
			System.out.println("조금 더 날아");
	}
	
}
