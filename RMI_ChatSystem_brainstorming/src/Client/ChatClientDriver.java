package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.rmi.registry.Registry;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import Server.ChatServerIF;

public class ChatClientDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try
		{
			String username = scan.nextLine();
           Registry r = LocateRegistry.getRegistry("localhost",1213);
           ChatServerIF serverstub= (ChatServerIF)r.lookup("ChatServer");
           // serverstub call by reference
           ChatClientIF client = new ChatClient(username,serverstub);
          
            ChatClientIF clientstub = (ChatClientIF) UnicastRemoteObject.exportObject(client,0);
           // als benutzer registrieren mit call by reference
            serverstub.registerChatClient(clientstub);
           // und dann Message senden.
            clientstub.broadcastMessage();          
   
           //
           
		}catch(RemoteException e)
		{
			
		}catch(NotBoundException e)
		{
			
		}
      
	}

}
