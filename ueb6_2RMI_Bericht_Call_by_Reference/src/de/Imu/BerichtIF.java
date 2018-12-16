package de.Imu;

import java.rmi.*;
import java.util.Date;

public interface BerichtIF extends Remote {

	public Date getDate() throws RemoteException;

	public void setDate(Date date) throws RemoteException;

	public String getDiagnose() throws RemoteException;

	public void setDiagnose(String diagnose)  throws RemoteException;

	public String getWeiteresVorgehen() throws RemoteException;

	public void setWeiteresVorgehen(String weiteresVorgehen) throws RemoteException;
}
