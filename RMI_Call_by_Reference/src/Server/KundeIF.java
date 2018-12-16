package Server;

import java.rmi.*;

public interface KundeIF extends Remote{

	public String getName() throws RemoteException;
}
