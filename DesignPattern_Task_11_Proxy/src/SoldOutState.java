public class SoldOutState implements State {

	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("동전을 넣을 수 없습니다. 상품이 모두 판매 된 상태입니다.");
	}

	public void ejectQuarter() {
		System.out.println("동전을 넣지 않은 상태입니다.");
	}

	public void turnCrank() {
		System.out.println("손잡이를 돌렸지만 상품이 없습니다.");
	}

	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}

	public String toString() {
		return "sold out";
	}
}