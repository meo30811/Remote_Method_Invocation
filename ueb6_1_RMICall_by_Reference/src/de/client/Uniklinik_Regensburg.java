package de.client;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import de.Imu.*;

public class Uniklinik_Regensburg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner eingabe = new Scanner(System.in);
			System.out.println("Bitte geben Sie ein Hostname ein: ");
			String hostname = eingabe.nextLine();

			Registry r = LocateRegistry.getRegistry(hostname,1213);// NotBoundException
		    FrüherkennungIF f = (FrüherkennungIF)r.lookup("Analysis Service");// Throws NotBoundException

		    RöntgenBildIF b = new RöntgenBild();
		    RöntgenBildIF stub = (RöntgenBildIF) UnicastRemoteObject.exportObject(b,0);
            // hier wird das RöntgenBild bei reference uebergeben
		    Bericht bericht = f.analysieren(stub);
            System.out.println("Bericht von München");
            System.out.println("------------------");
            System.out.println("Diagnose: "+bericht.getDiagnose());
            System.out.println("Date: "+bericht.getDate());
            System.out.println("weiteres Vorgehen: "+bericht.getWeiteresVorgehen());

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(NotBoundException e)
		{

		}

	}

}
