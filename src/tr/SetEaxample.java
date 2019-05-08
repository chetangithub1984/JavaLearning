package tr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEaxample {

	public static void main(String[] args) {
		
		Set <Integer> myset = new LinkedHashSet<>();
		List <Integer> list = new ArrayList<Integer> () ;
		
		myset.add(2);
		myset.add(4);
		myset.add(34);
		myset.add(93);
		myset.add(75);
		
		//list.addAll(myset);
		
		myset.forEach(System.out::println);
	//	list.forEach(System.out::println);

	}

}
