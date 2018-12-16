package Server;

import java.rmi.*;
import Client.ChatClientIF;

public interface ChatServerIF extends Remote {

public void registerChatClient(ChatClientIF chatClient)throws RemoteException;
public void brodcastMessage(String message) throws RemoteException;	

}
