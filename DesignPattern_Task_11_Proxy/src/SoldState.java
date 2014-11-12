public class SoldState implements State {

	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("기다려주세요, 이미 알맹이 드렸습니다.");
	}

	public void ejectQuarter() {
		System.out.println("이미 돌린 상태입니다.");
	}

	public void turnCrank() {
		System.out.println("2번 돌려도 한개 더 못 받습니다.");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("매진 되었습니다.");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}