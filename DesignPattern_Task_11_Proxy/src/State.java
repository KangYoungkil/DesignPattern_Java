import java.io.Serializable;
import java.rmi.RemoteException;

public interface State extends Serializable
{
	public void insertQuarter();

	public void enjectQuarter();

	public void turnCrank() throws RemoteException;

	public void dispense();

}