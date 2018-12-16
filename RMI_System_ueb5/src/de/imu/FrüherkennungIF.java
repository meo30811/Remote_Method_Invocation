package de.imu;

import java.rmi.*;
public interface FrüherkennungIF extends Remote {

 Bericht analysieren(RöntgenBild bild) throws RemoteException;
}
