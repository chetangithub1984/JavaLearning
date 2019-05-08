package tr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>() ;
		
		list.add(3);
		list.add(24);
		list.add(6);
		list.add(2);
		list.add(2);
		
		Comparator<Integer> com = (o1,o2) -> 
		{return o1>o2?1:-1;};
		
		Collections.sort(list, com);
		
		list.forEach(System.out::println);
		

	}

}
