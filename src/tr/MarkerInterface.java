package tr;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class MarkerInterface {

	public static void main(String[] args) {
	
		markerImpl obj = new markerImpl() ;
		if ( obj instanceof marker) {
			
		}

	}

}

interface marker {
	
}

class markerImpl implements marker {
	public void show ( ) {
		System.out.println("implementing");
	}
}
