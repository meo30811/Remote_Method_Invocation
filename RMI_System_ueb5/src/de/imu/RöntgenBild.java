package de.imu;

import java.io.Serializable;
import java.util.*;
public class RöntgenBild implements Serializable {

	private Date aufnahmeVom;
	private transient String patientName;
	private byte[] rawData;
	
	public RöntgenBild()
	{
		this.aufnahmeVom = Calendar.getInstance().getTime();
		this.patientName  = "nelson noumen";
		this.rawData = new byte[]{0x20,0x30,0x40};
	}
	public Date getAufnahmeVom() {
		return aufnahmeVom;
	}
	public void setAufnahmeVom(Date aufnahmeVom) {
		this.aufnahmeVom = aufnahmeVom;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public byte[] getRawData() {
		return rawData;
	}
	public void setRawData(byte[] rawData) {
		this.rawData = rawData;
	}
}
