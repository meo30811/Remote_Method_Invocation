package de.imu;

import java.io.Serializable;
import java.util.*;

public class Bericht implements Serializable {

	private Date Datum;
	private String diagnose;
	private String weiteresVorgehen;
	
	
	public Bericht(Date datum, String diagnose, String weiteresVorgehen) {
		super();
		Datum = datum;
		this.diagnose = diagnose;
		this.weiteresVorgehen = weiteresVorgehen;
	}
	public Bericht()
	{
		this.Datum = Calendar.getInstance().getTime();
		this.diagnose = "Krank";
		this.weiteresVorgehen="kardiologue";
	}
	public Date getDatum() {
		return Datum;
	}
	public void setDatum(Date datum) {
		Datum = datum;
	}
	public String getDiagnose() {
		return diagnose;
	}
	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	public String getWeiteresVorgehen() {
		return weiteresVorgehen;
	}
	public void setWeiteresVorgehen(String weiteresVorgehen) {
		this.weiteresVorgehen = weiteresVorgehen;
	}
}
