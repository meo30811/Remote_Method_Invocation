package de.Imu;

import java.rmi.RemoteException;
import java.util.*;

public class FrüherkennungServer implements FrüherkennungIF {

	@Override
	public Bericht analysieren(RöntgenBildIF bild) {
		// TODO Auto-generated method stub
		try {
			System.out.println("RöntgenBild empfangen: "+ bild.ausgabe());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Bericht();
	}

}
