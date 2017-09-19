/*
 * 13.02.2017 imports edited
 * 09.02.2015 Original version
 */


package msg;


import peer.PeerController;
import peer.PeerFrame;
import peer.PeerView;


public class P2PPeer
{
	public static void main( String[] args )
	{
		try {
			PeerController controller = new PeerController();
			PeerView view = new PeerFrame( controller );
	
			controller.setView( view );
			controller.begin();
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
}
