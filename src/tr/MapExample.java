package tr;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class MapExample {

	public static void main(String[] args) {
		
		Map <String,String> map = new TreeMap<> ();
		
		map.put("name", "Chetan");
		map.put("Actor", "Amir");
		map.put("Laptop", "HP");
	;
		Set <String>set = map.keySet();
		System.out.println(map.get("name"));
		
		for (String s : set) {
			System.out.println(s +  "  "   + map.get(s));
		}
		

	}

}
