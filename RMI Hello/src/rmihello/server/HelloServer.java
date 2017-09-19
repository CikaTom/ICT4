/*
 * 11.03.2011 Edited
 * 23.03.2009 Edited
 * 13.04.2008 Original version
 */
 
package rmihello.server;


import static rmihello.common.HelloConfig.*;

import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;


public class HelloServer
{
	public static void main( String[] args )
	{
		try {
			LocateRegistry.createRegistry( 1099 );
			
			HelloController controller = new HelloController();
			
			Naming.rebind( SERVICE_NAME, controller );
			
			System.out.println( "Server listening on " + InetAddress.getLocalHost().getHostAddress() );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}