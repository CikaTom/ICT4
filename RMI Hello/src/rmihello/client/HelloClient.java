/*
 * 23.03.2011 Edited
 * 23.03.2009 New package structure
 * 13.04.2008 Original version
 */
 
package rmihello.client;


import static rmihello.common.HelloConfig.*;

import java.rmi.*;

import javax.swing.*;

import rmihello.common.*;


public class HelloClient
{
	public static void main( String[] args )
	{
		try {
			String ip = JOptionPane.showInputDialog( null, "IP" );
			String url = "rmi://" + ip + "/" + SERVICE_NAME;
			
			Hello h = (Hello) Naming.lookup( url );
			
			System.out.println( h.getHelloText() );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}