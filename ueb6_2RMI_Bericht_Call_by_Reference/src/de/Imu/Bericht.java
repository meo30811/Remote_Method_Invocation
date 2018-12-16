package de.Imu;

import java.io.Serializable;
import java.util.*;

public class Bericht implements BerichtIF {

	private Date date;
	private String Diagnose;
	private String weiteresVorgehen;

	public Bericht()
	{
		this.date = Calendar.getInstance().getTime();
		this.Diagnose ="krank";
		this.weiteresVorgehen = "zur NotAufnahme";
		System.out.println("bericht erstellt!");
	}

	public Bericht(Date date, String Diagnose, String weiteresVorgehen)
	{
		this.date = date;
		this.Diagnose = Diagnose;
		this.weiteresVorgehen = weiteresVorgehen;
	}
	/**
	 * @return the date
	 */

	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the diagnose
	 */
	public String getDiagnose() {
		return Diagnose;
	}
	/**
	 * @param diagnose the diagnose to set
	 */
	public void setDiagnose(String diagnose) {
		Diagnose = diagnose;
	}
	/**
	 * @return the weiteresVorgehen
	 */
	public String getWeiteresVorgehen() {
		return weiteresVorgehen;
	}
	/**
	 * @param weiteresVorgehen the weiteresVorgehen to set
	 */
	public void setWeiteresVorgehen(String weiteresVorgehen) {
		this.weiteresVorgehen = weiteresVorgehen;
	}
}
