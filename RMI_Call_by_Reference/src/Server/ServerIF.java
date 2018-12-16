package Server;

import java.rmi.*;

public interface ServerIF extends Remote {

	public void anlegen(KundeIF kunde) throws RemoteException;
}
