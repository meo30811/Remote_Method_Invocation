package de.imu;

import java.rmi.*;
public interface Fr�herkennungIF extends Remote {

 Bericht analysieren(R�ntgenBild bild) throws RemoteException;
}
