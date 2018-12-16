package Client;

import Server.ServerIF;
import Server.Kunde;
import Server.KundeIF;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

public class RMIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     try
     {   
    	 
    	 
    	 Registry r = LocateRegistry.getRegistry("localhost",1213);
    	 ServerIF serverstub = (ServerIF) r.lookup("server");
    	 
    	 Kunde k = new Kunde();
    	 k.setName("Olivier");
    	 KundeIF kunde = k;
    	 
    	 KundeIF kundeStub = (KundeIF) UnicastRemoteObject.exportObject(kunde,0);
    	 serverstub.anlegen(kundeStub);
    	 
     }catch(RemoteException e)
     {
    	 e.printStackTrace();
    	 
     }catch(NotBoundException e)
     {
    	 e.printStackTrace();
     }
	}

}
