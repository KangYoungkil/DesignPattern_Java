import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements
		GumballMachineRemote
{
	int count;// 볼 갯수
	int num_op = 1;// 볼을 빼낸 횟수

	State hqs;
	State nqs;
	State sos;
	State ss;
	State ws;

	State state;
	String location;

	protected GumballMachine(String location, int count) throws RemoteException
	{
		super();
		this.count = count;
		this.location = location;
		hqs = new HasQuarterState(this);
		nqs = new NoQuarterState(this);
		sos = new SoldOutState(this);
		ss = new SoldState(this);
		ws = new WinnerState(this);
		state = nqs;
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
		return hqs;
	}

	public State getNoQuarterState()
	{
		return nqs;
	}

	public State getSoldOutState()
	{
		return sos;
	}

	public State getSoldState()
	{
		return ss;
	}

	public State getWinnerState()
	{
		return ws;
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
			state = sos;
		}
		state.turnCrank();
		System.out.println("number of Balls is " + count);
	}
}