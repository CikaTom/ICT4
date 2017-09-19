/*
 * 13.02.2017 imports edited
 * 09.02.2015 Original version
 */


package msg;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import common.AddressServerInterface;

import server.AddressServerController;
import server.AddressServerFrame;
import server.AddressServerView;


public class P2PAddressServer
{
	public static void main( String[] args )
	{
		try {
			AddressServerController controller = new AddressServerController();
			AddressServerView view = new AddressServerFrame( controller );
		
			controller.setView( view );
			
			LocateRegistry.createRegistry( 1099 );
			
			Naming.rebind( AddressServerInterface.SERVICE_NAME, controller );
			
			view.println( "Address Server is running" );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
