public class Adapter implements Duck {
	Turkey turkey; // Composition

	public Adapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble(); // Delegation
	}

	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly(); // Delegation
		}

	}

	public void fly(int n) {
		System.out.println(n+"번째 fly");
		turkey.fly();
	}
	public void quack(int n){
		System.out.println(n+"번째 quack");
		turkey.gobble();
	}
}