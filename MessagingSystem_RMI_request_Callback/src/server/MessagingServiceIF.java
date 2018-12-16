package server;

import java.rmi.*;
import java.util.*;

public interface MessagingServiceIF extends Remote {
	
public User registrieren(User user) throws RemoteException;
public Message broadcastMessage(User receiver,Message message) throws RemoteException ;
public List<Message> retrieveMessage(User user) throws RemoteException;

}
