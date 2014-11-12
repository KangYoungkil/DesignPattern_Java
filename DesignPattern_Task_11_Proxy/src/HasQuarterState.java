import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine machine;

	public HasQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("동전은 한 개만 넣어주세요.");
	}

	public void ejectQuarter() {
		System.out.println("동전이 반환됩니다.");
		machine.setState(machine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("손잡이를 돌리셨습니다.");
		int winner = randomWinner.nextInt(10);

		if ((winner == 0) && (machine.getCount() > 1)) {
			machine.setState(machine.getWinnerState());
		} else {
			machine.setState(machine.getSoldState());
		}
	}

	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");
	}

	public String toString() {
		return "waiting for turn of crank";
	}
}