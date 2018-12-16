package de.Imu;

import java.rmi.*;
import java.util.Date;

public interface RöntgenBildIF extends Remote {

	public Date getAufnahmeVom() throws RemoteException;
	public void setAufnahmeVom(Date aufnahmeVom) throws RemoteException;
	public byte[] getRawData() throws RemoteException;
	public void setRawData(byte[] rawData) throws RemoteException ;
	public String getPatientName() throws RemoteException;
	public void setPatientName(String patientName) throws RemoteException;
	public String ausgabe() throws RemoteException ;
}
