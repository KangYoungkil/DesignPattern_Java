import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote// Proxy
{
	public int getCount() throws RemoteException;

	public String getLocation() throws RemoteException; // 뽑기 기계의 위치

	public State getState() throws RemoteException;
}