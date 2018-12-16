package de.Imu;

import java.rmi.RemoteException;
import java.util.concurrent.TimeUnit;


public class Analysis implements Runnable {

	private BerichtCallbackIF bericht;

	
	public Analysis(BerichtCallbackIF bericht)
	{
		this.bericht= bericht;
	}
  
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{			
		TimeUnit.SECONDS.sleep(10);	
		System.out.println("...bin mit Analyse fertig, Bericht wird jetzt ueber den Callback-Stub an Client uebertragen!");
	    bericht.uebertrageBericht(new Bericht());
	      
		}catch(RemoteException e)
		{
			e.printStackTrace();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
