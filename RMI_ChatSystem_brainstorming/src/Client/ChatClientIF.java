package Client;

import java.rmi.*;

public interface ChatClientIF extends Remote {

	public void retrieveMessage(String message) throws RemoteException;
	public void broadcastMessage() throws RemoteException;
}
