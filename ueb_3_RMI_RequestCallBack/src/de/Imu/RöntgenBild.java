package de.Imu;

import java.io.Serializable;
import java.util.*;

public class RöntgenBild implements Serializable{

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

public Date getAufnahmeVom() {
	return aufnahmeVom;
}
/**
 * @param aufnahmeVom the aufnahmeVom to set
 */

public void setAufnahmeVom(Date aufnahmeVom) {
	this.aufnahmeVom = aufnahmeVom;
}
/**
 * @return the rawData
 */

public byte[] getRawData() {
	return rawData;
}
/**
 * @param rawData the rawData to set
 */

public void setRawData(byte[] rawData) {
	this.rawData = rawData;
}
/**
 * @return the patientName
 */

public String getPatientName() {
	return patientName;
}
/**
 * @param patientName the patientName to set
 */

public void setPatientName(String patientName) {
	this.patientName = patientName;
}

}
