package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
	
		Map <String, String> map = new HashMap<>();
		
	  map.put("name", "Amit");
	  map.put("Actor", "Amir");
	  map.put("Singer", "Amit");
	//  map.put("name", "Vinay");
	  
	  //System.out.println(map);

	  Set <String> values = map.keySet();
	 //System.out.println(map.get("name"));
	  
	  
	  for ( String i : values ) {
		  if ( i.equalsIgnoreCase("Actor")) {
		 System.out.println(i  +  "    " + map.get(i));
		  }
	  }
	  
	 Set<Entry<String, String>> en = map.entrySet();
	  
	  
	  for (Entry<String, String > em : en ) {
	
		  System.out.println(em.getKey() + " " + em.getValue());
	  }
		

	}

}
