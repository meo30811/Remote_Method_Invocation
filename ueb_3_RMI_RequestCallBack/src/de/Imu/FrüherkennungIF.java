package de.Imu;

import java.rmi.*;
import de.client.*;
public interface FrüherkennungIF extends Remote {

	// die Methode gibt ein Renmote Object zurück
	public void analysieren(RöntgenBild bild, BerichtCallbackIF bericht) throws RemoteException;
}
