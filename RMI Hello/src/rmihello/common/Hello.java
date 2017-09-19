/*
 * 11.03.2011 Edited
 * 23.03.2009 New package structure
 * 13.04.2008 Original version
 */
 
package rmihello.common;


import java.rmi.*;


public interface Hello
	extends Remote
{
	public String getHelloText()
		throws RemoteException;
}