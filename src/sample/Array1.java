package sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array1 {

	public static void main(String[] args) {
			
		List <String> mylist = new ArrayList<String>();
		mylist.add("Chetan");
		mylist.add("Patel");
		Iterator<String> mylistite = mylist.iterator();
	    while ( mylistite.hasNext()) {
	    	System.out.println(mylistite.next());
	    }
	    
	   System.out.println(mylist.indexOf("Chetan")); 
		

	}
}
