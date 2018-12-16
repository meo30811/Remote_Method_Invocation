package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import server.Message;
import server.MessagingServiceIF;
import server.User;

public class ClientMessagingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		Registry r = LocateRegistry.getRegistry("localhost",1213);
		MessagingServiceIF serverstub = (MessagingServiceIF) r.lookup("Messaging Service");
		System.out.println("Welcome to OTH messaging service.");
		System.out.println("You are sending from " +r.toString());
		System.out.println("Commands allowed are:");
		System.out.println("REG username");
		System.out.println("SND #<to>#<text>");
		System.out.println("RCV<username>");
			
		ClientMessageHandler client = new ClientMessageHandler( serverstub);
		new Thread(client).start();
		
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(NotBoundException e)
      {
		e.printStackTrace();
      }
      
	}
	

}
