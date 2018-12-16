package de.client;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import de.imu.*;

public class Uniklinik_Regensburg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
         Registry r = LocateRegistry.getRegistry("localhost",1213);
         FrüherkennungIF erk= (FrüherkennungIF) r.lookup("Analysis Service");
         // call by value
         RöntgenBild bild = new RöntgenBild();
         Bericht bericht = erk.analysieren(bild);
         
         System.out.println("Informationen über "+bild.getPatientName());
         System.out.println("=====================================");
         System.out.println("Aufnahme vom "+bild.getAufnahmeVom());
         System.out.println("Bild: "+bild.getRawData());
         System.out.println("Datum:  "+bericht.getDatum());
         System.out.println("Diagnose:  "+bericht.getDiagnose());
         System.out.println("weiteresVorgehen :  "+bericht.getWeiteresVorgehen());
         
         
		}catch(RemoteException e)
		{
			e.printStackTrace();
		}catch(NotBoundException e)
		{
			e.printStackTrace();
		}
	}

}
