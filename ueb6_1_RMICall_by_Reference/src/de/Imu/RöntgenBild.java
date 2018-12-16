package de.Imu;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.*;

public class RöntgenBild implements RöntgenBildIF{

  private Date aufnahmeVom;
  private byte[] rawData;
  transient String patientName;

  public RöntgenBild()
  {
	  this.aufnahmeVom= Calendar.getInstance().getTime();
	  this.rawData = new byte[]{ 0x30,0x12,0x12};
	  this.patientName ="nelson Noumen";
  }
  public RöntgenBild(Date aufnameVom, byte[] rawData, String patientName)
  {
	  this.aufnahmeVom = aufnameVom;
	  this.rawData = rawData;
	  this.patientName = patientName;
  }
/**
 * @return the aufnahmeVom
 */
  @Override
public Date getAufnahmeVom() {
	return aufnahmeVom;
}
/**
 * @param aufnahmeVom the aufnahmeVom to set
 */
  @Override
public void setAufnahmeVom(Date aufnahmeVom) {
	this.aufnahmeVom = aufnahmeVom;
}
/**
 * @return the rawData
 */
  @Override
public byte[] getRawData() {
	return rawData;
}
/**
 * @param rawData the rawData to set
 */
  @Override
public void setRawData(byte[] rawData) {
	this.rawData = rawData;
}
/**
 * @return the patientName
 */
  @Override
public String getPatientName() {
	return patientName;
}
/**
 * @param patientName the patientName to set
 */
  @Override
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String ausgabe() throws RemoteException {
	// TODO Auto-generated method stub
  return "RöntgenBild [aufnahmeVom=" + aufnahmeVom + ", rawData=" + Arrays.toString(rawData) + "]";
}

}
