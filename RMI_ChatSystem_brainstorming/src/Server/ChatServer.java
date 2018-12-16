package Server;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import Client.ChatClientIF;

public class ChatServer implements ChatServerIF{
    
	private ArrayList<ChatClientIF> chatClients = new ArrayList<ChatClientIF>();
	
	@Override
	public synchronized void registerChatClient(ChatClientIF chatClient) throws RemoteException {
		// TODO Auto-generated method stub
		this.chatClients.add(chatClient);
	}

	@Override
	public synchronized void brodcastMessage(String message) throws RemoteException {
		// TODO Auto-generated method stub
		// the client in another jvm will call this method to send message to server
		int i=0;
		while(i<chatClients.size())
		{
			// the server sends the message back to the client calling the retrievemessage method
			chatClients.get(i++).retrieveMessage(message);
		}
	}

}
