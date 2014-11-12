public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("기다려주세요, 이미 알맹이 드렸습니다.");
	}

	public void ejectQuarter() {
		System.out.println("기다려주세요, 이미 알맹이 드렸습니다.");
	}

	public void turnCrank() {
		System.out.println("다시 돌려도 알맹이 더 못 드립니다.");
	}

	public void dispense() {
		System.out.println("당첨 되서 2개 드립니다.");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("매진 되었습니다.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
