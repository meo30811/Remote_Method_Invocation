package de.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import de.Imu.BerichtCallbackIF;
import de.Imu.FrüherkennungIF;
import de.Imu.RöntgenBild;

public class Uniklinik_Regensburg{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		Registry r = LocateRegistry.getRegistry("localhost",1213);
		FrüherkennungIF serverstub = (FrüherkennungIF)r.lookup("Analysis Service");
		BerichtCallback bericht = new BerichtCallback();
		BerichtCallbackIF client = (BerichtCallbackIF) UnicastRemoteObject.exportObject(bericht,0);
		RöntgenBild bild = new RöntgenBild();
		serverstub.analysieren(bild, client);

	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(NotBoundException e)
    {
		e.printStackTrace();
     }
	}

}
