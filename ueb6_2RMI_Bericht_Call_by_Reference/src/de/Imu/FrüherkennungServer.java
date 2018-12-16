package de.Imu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class FrüherkennungServer implements FrüherkennungIF {

	@Override
	public BerichtIF analysieren(RöntgenBild bild) {
		// TODO Auto-generated method stub
		BerichtIF berichtstub = null;
		try {
			Bericht b = new Bericht();
			berichtstub = (BerichtIF) UnicastRemoteObject.exportObject(b,0);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return berichtstub;	
	
	}

}
