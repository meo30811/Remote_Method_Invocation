package Client;
import java.rmi.RemoteException;
import java.util.*;

import server.MessagingServiceIF;
import server.*;

public class ClientMessageHandler implements Runnable {
 
	private String text= null;
	private MessagingServiceIF serverstub;
	
	public ClientMessageHandler( MessagingServiceIF serverstub)
	{
	
		this.serverstub = serverstub;
	}
	
	@Override
	public void run()
	{		
		Scanner scan = new Scanner(System.in);
		do
		{
	   
		text = scan.nextLine();
		String command = getCommand(text).toLowerCase();
		switch(command)
		{
		case "reg":
			String username = getUser(text);
			User user = new User(username);
			try {
			User usern=	serverstub.registrieren(user);
			if(usern!=null)
			{
				System.out.println("OK_"+usern.getName());
			}else
			{
				System.out.println("this username exist already: "+usern.getName()+":)");
			}
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "snd":
			String sender = getReceiver(text);
			User userReceiver = new User(sender);
			String message = getMessageToSend(text);
			Message mess = new Message(message);
			try {
				Message m = serverstub.broadcastMessage(userReceiver, mess);
				System.out.println(m.toString());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "rcv":
			String receiver = getUser(text);
			User Receiver = new User(receiver);
			try {
				List<Message> messages = serverstub.retrieveMessage(Receiver);
				for(Message tempMessage: messages )
				{
					System.out.println(tempMessage.toString());
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		}while(text!= null && !text.equalsIgnoreCase("bye"));
	}
	public String getCommand(String message)
	{
		String[] mail = message.split(" ");
		String result = mail[0];
		return result;
	}
	public String getUser(String message)
	{
		String[] result = message.split(" ");
		return result[1];
	}
    public String getSender(String message)
    {
    	String[] mail = message.split(" ");
		String[] result = mail[1].split("#");
		return result[0];
    }
    public String getReceiver(String message)
    {
        String[] mail = message.split(" ");
        String[] result = mail[1].split("#");
	    return result[1];
    }
    public String getMessageToSend(String message)
    {
    	int startindex = message.indexOf(' ');
    	int endindex = message.length();
        String result = message.substring(startindex,endindex);
    	return result;
    }
}
