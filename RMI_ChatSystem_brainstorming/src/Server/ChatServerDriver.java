package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.AlreadyBoundException;

public class ChatServerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			ChatServerIF server = new ChatServer();
		    ChatServerIF stub = (ChatServerIF) UnicastRemoteObject.exportObject(server,0);
		    Registry r = LocateRegistry.createRegistry(1213);
		    r.bind("ChatServer", stub);
		    System.out.println("Chat server runs!");

		}catch(RemoteException e)
		{
			e.printStackTrace();
		}catch(AlreadyBoundException e)
		{
			e.printStackTrace();
		}
	}

}
