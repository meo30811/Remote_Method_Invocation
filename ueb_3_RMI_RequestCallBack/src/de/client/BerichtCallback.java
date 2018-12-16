package de.client;
import java.rmi.RemoteException;
import java.util.concurrent.TimeUnit;

import de.Imu.Bericht;
import de.Imu.BerichtCallbackIF;
public class BerichtCallback implements BerichtCallbackIF {

	@Override
	public void uebertrageBericht(Bericht bericht) throws RemoteException {
		// TODO Auto-generated method stub
	System.out.println("Bericht empfangen mit Datum="+ bericht.getDate() + " und Diagnose=" + bericht.getDiagnose() + " und Vorgehen=" + bericht.getWeiteresVorgehen());
    
	new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			try {
				TimeUnit.SECONDS.sleep(1);
				System.exit(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}).start();
	}

}
