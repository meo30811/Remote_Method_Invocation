package Server;

import java.rmi.RemoteException;

public class serverRemoteObject implements ServerIF {

	@Override
	public void anlegen(KundeIF kunde) throws RemoteException {
		// TODO Auto-generated method stub
		String name = kunde.getName();
		System.out.println(name);
	}

}
