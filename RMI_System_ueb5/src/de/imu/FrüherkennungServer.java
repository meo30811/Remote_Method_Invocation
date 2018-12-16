package de.imu;

import java.rmi.RemoteException;

public class FrüherkennungServer implements FrüherkennungIF {

	@Override
	public Bericht analysieren(RöntgenBild bild) throws RemoteException {
		// TODO Auto-generated method stub
		return new Bericht();
	}

}
