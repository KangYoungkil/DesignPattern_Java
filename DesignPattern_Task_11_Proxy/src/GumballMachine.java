public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;
	String location;

	public GumballMachine(String location, int count) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = count;
		if (count > 0) {
			state = noQuarterState;
		}
		this.location = location;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}

	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

	public State getState() {
		return state;
	}

	public String getLocation() {
		return location;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n주식회사 사행성 왕뽑기");
		result.append("\n자바를 장착한 2013년형 뽑기기계");
		result.append("\n남은 개수 : " + count + "개");

		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}