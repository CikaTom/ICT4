/*
 * 13.02.2017 imports edited
 * 09.02.2015 Original version
 */


package common;


import java.rmi.Remote;
import java.rmi.RemoteException;

import model.Message;


public interface PeerInterface
	extends Remote
{
	public void deliverMessage( Message message ) throws RemoteException;
}
