package server;

import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.*;

public class MessagingService implements MessagingServiceIF {

	private Map<User,List<Message>> db = new TreeMap<>();
	Lock lock = new ReentrantLock();
	
	@Override
	public User registrieren(User user) throws RemoteException {
		// TODO Auto-generated method stub
		lock.lock();
		try
		{
		if(!db.containsKey(user))
		{
			db.put(user, new LinkedList<Message>());			
		}
		return user;
		
		}finally
		{
		   lock.unlock();
		}
	}

	@Override
	public Message broadcastMessage(User receiver, Message message) throws RemoteException {
		// TODO Auto-generated method stub
		lock.lock();
		try
		{
		if(db.containsKey(receiver))
		{
			db.get(receiver).add(message);
		
		}else
		{
			System.out.println("user not found in db:)");
		}
		return message;
		}finally
		{
		lock.unlock();
		}
	}

	@Override
	public List<Message> retrieveMessage(User user) throws RemoteException {
		// TODO Auto-generated method stub
		lock.lock();
		try
		{
		   List<Message> message= null;
		
		   if(db.containsKey(user))
		   {
			 message = db.get(user) ;
			 db.replace(user, new LinkedList<Message>());
		   }
		  return message;
		}finally
		{
		   lock.unlock();
		}
	
	}

}
