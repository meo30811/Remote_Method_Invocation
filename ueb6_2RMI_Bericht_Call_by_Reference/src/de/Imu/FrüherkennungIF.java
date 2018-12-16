package de.Imu;

import java.rmi.*;

public interface FrüherkennungIF extends Remote {

	// die Methode gibt ein Renmote Object zurück
	public BerichtIF analysieren(RöntgenBild bild) throws RemoteException;
}
