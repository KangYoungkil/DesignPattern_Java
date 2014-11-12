public class GumballMonitor {
	GumballMachine machine;

	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	public void report() {
		System.out.println("뽑기 기계: " + machine.getLocation());
		System.out.println("현재 남은 개수 : " + machine.getCount() + " gumballs");
		System.out.println("현재 상태 : " + machine.getState());
	}
}