package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class collex {

	public static void main(String[] args) {
	
		
		List<String> li = new ArrayList<String>();
		
		li.add("Chtan");
		li.add("Vijay");

		System.out.println(li.size());
		
		Iterator<String> hu = li.iterator();
		li.containsAll(li);
		
		while ( hu.hasNext()) {
			System.out.println(hu.next());
		}
		
		Set<Integer> myset = new HashSet<>();
		myset.add(1);
		myset.add(4);
		myset.add(7);
		
		System.out.println(myset.size());
		

	}

}
