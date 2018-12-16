package Client;

import java.rmi.RemoteException;
import java.util.Scanner;
import java.io.Serializable;
import java.rmi.*;
import Server.ChatServerIF;


public class ChatClient implements ChatClientIF {

	private ChatServerIF chatServer;
	private String name ;
	
	public ChatClient(String name, ChatServerIF chatServer)
	{
		
		this.name = name;
        this.chatServer = chatServer;
		
	}

	@Override
	public void retrieveMessage(String message) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
   @Override
     public void broadcastMessage() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String message = null;
		do 
		{
			message = scan.nextLine();
			try
			{
				chatServer.brodcastMessage(name+": "+message);
			}catch(RemoteException e)
			{
			  e.printStackTrace();	
			}
			
		}while(message!=null && !message.equalsIgnoreCase("bye"));
	}

	
	}

	

