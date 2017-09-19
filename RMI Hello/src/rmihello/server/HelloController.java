/*
 * 11.03.2011 Edited
 * 23.02.2009 Renamed -- new package structure
 * 13.04.2008 Original version
 */
 
package rmihello.server;


import java.rmi.*;
import java.rmi.server.*;

import rmihello.common.*;


public class HelloController
	extends UnicastRemoteObject
	implements Hello
{
	public HelloController()
		throws RemoteException
	{
		super();
	}
	
	
	public String getHelloText()
		throws RemoteException
	{
		System.out.println( "Here is getHelloText()" );
		
		return "Goodbye world";
	}
}