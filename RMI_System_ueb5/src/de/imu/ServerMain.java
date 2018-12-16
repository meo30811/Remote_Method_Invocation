package de.imu;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Fr�herkennungIF erkennung = new Fr�herkennungServer();
     try
     {
     
     Fr�herkennungIF stub = (Fr�herkennungIF) UnicastRemoteObject.exportObject(erkennung,0);
     Registry r = LocateRegistry.createRegistry(1213);
     r.bind("Analysis Service", stub);
     System.out.println("server starts");
     
	}catch(RemoteException e)
	{
		
	}catch(AlreadyBoundException e)
     {
		
     }

  }
}