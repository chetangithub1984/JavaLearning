package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Arraypractice {

	public static void main(String[] args) {

		Map <String,Integer> mymap = new HashMap<String,Integer>();
		mymap.put("Chtan", 9545522);
		mymap.put("Neelam", 12345);
		mymap.put("Charan", 132442);
		
		Set<String> set = mymap.keySet();
		
		for (String itr : set ) {
			System.out.println(itr  +  "  "  + mymap.get(itr));
		}
		
		Set<Entry<String, Integer>> enty = mymap.entrySet();
	
	for (Entry<String,Integer> gt : mymap.entrySet()) {
		m();
		System.out.println(gt.getKey() + " " + gt.getValue());
	}
	

		

	}
	public static void m () {
		System.out.println("Inner loop");
	}
}
