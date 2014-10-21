public class DuckTestDrive {
	public static void main(String[] args) {

		WildTurkey turkey = new WildTurkey(); // Adaptee
		Duck adapter = new Adapter(turkey);
		adapter.quack();
		adapter.fly();

		WildTurkey koreaTurkey = new KoreaWildTurkey(); // Subclass of the
														// Adaptee
		Duck adapter1 = new Adapter(koreaTurkey); // Also works
		adapter1.quack();
		adapter1.fly();
		
		adapter1.quack(3);
		adapter1.fly(3);
		
	}
}