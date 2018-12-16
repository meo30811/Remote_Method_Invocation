package de.Imu;

import java.rmi.*;

public interface BerichtCallbackIF extends Remote {

	public void uebertrageBericht(Bericht bericht) throws RemoteException;
}
