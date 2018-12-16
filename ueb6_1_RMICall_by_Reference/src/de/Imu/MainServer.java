package de.Imu;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			 System.out.println("Intanz und Stub generieren");
			 FrüherkennungIF f = new FrüherkennungServer();
			FrüherkennungIF stub = (FrüherkennungIF)UnicastRemoteObject.exportObject(f,0);

			System.out.println("an Registry binden");
			Registry r = LocateRegistry.createRegistry(1213);
			r.bind("Analysis Service", stub);// AlreadyBoundException

			System.out.println("welcome to Analysis service!");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
