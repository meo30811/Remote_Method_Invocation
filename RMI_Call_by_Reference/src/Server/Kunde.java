package Server;

import java.rmi.RemoteException;

public class Kunde implements KundeIF{

	private String name;
	@Override
	public String getName() throws RemoteException {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName(String name) throws RemoteException
	{
		this.name = name;
	}

}
