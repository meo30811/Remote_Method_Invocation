package Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ServerIF interf = new serverRemoteObject();
      try
      {
    	 ServerIF stub = (ServerIF) UnicastRemoteObject.exportObject(interf,0);
    	 Registry r = LocateRegistry.createRegistry(1213);
    	 r.bind("server", stub);
    	 System.out.println("server starts");
    	 
      }catch(RemoteException e)
      {
    	  e.printStackTrace();
    	  
      }catch(AlreadyBoundException e)
      {
    	  e.printStackTrace();
      }
	}

}
