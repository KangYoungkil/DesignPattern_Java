import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements
		GumballMachineRemote
{
	int count;
	int num_op = 1;
	State hasQuStateState;
	State noQuarterState;
	State soldOutState;
	State soldState;
	State winnerState;

	State state;
	String location;

	protected GumballMachine(String location, int count) throws RemoteException
	{
		super();
		this.count = count;
		this.location = location;
		hasQuStateState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		state = noQuarterState;
	}

	public int getCount() throws RemoteException
	{
		return count;
	}

	public void setCount(int c)
	{
		this.count = c;
	}

	public int getNum_op()
	{
		return num_op;
	}

	public void setNum_op(int num)
	{
		this.num_op = num;
	}

	public String getLocation() throws RemoteException
	{
		return location;
	}

	public State getState() throws RemoteException
	{
		return state;
	}

	public void setState(State state)
	{
		this.state = state;
	}

	public State getHasQuarterState()
	{
		return hasQuStateState;
	}

	public State getNoQuarterState()
	{
		return noQuarterState;
	}

	public State getSoldOutState()
	{
		return soldOutState;
	}

	public State getSoldState()
	{
		return soldState;
	}

	public State getWinnerState()
	{
		return winnerState;
	}

	public void insertCoin()
	{
		state.insertQuarter();
	}

	public void ejectCoing()
	{
		state.enjectQuarter();
	}

	public void turnCrank() throws RemoteException
	{
		if (count == 0)
		{
			System.out.println("No Ball");
			state = soldOutState;
		}
		state.turnCrank();
		System.out.println("number of Balls is " + count);
	}
}