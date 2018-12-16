package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MessagingServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       try {
    	System.out.println("Objekt anlegen und Stub erzeugen!");  
    	MessagingServiceIF service = new MessagingService();
		MessagingServiceIF servicestub = (MessagingServiceIF)UnicastRemoteObject.exportObject(service,0);
		
		Registry r = LocateRegistry.createRegistry(1213);
		r.bind("Messaging Service", servicestub);
		
		System.out.println("welcome to Messaging service!");
		
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(AlreadyBoundException e)
     {
		e.printStackTrace();
    }
  }

}
