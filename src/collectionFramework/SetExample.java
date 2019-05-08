package collectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
	//	Set <String> set = new HashSet<String>();
		//Set <Integer> set = new TreeSet<>();
		Set <Integer> set = new LinkedHashSet<>();
		
/*		System.out.println(set.add("Chetan"));
		System.out.println(set.add("Vinay"));
		System.out.println(set.add("Swati"));
		System.out.println(set.add("Swati"));*/
		
		set.add(10);
		set.add(4);
		set.add(34);
		set.add(5);
		
		
		
		for ( int i : set) {
			System.out.println(i);
		}
		
		/*set.add("Chetan");
		set.add("Vinay") ;
		set.add("Swati");
		set.add("Swati");*/
		
	/*	for ( String i : set) {
			System.out.println(i);
		}*/


	}

}
