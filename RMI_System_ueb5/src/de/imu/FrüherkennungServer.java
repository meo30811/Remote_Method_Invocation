package de.imu;

import java.rmi.RemoteException;

public class Fr�herkennungServer implements Fr�herkennungIF {

	@Override
	public Bericht analysieren(R�ntgenBild bild) throws RemoteException {
		// TODO Auto-generated method stub
		return new Bericht();
	}

}
