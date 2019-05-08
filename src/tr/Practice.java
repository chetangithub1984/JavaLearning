package tr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {

	@Test
	public void mtd () {
		String str [] = new String [3];
		str[0] = "Chetan";
		str[1] = "Patel";
		str[2] = "Manish";
		for ( int i = 0 ; i < str.length ; i ++) {
			System.out.println(str[i]);
			//System.out.println();
		}
		
		List<Integer> col = new ArrayList<>();
		col.add(2);
		col.add(3);
		List<Integer> col1 = new ArrayList<Integer>();
		col1.add(2);
		col1.add(3);
		System.out.println(col.size());
		//Iterator<Integer> obj = col.iterator();
		System.out.println(col);
		Assert.assertEquals(col, col1);
		
		Map<Integer,String> mymap = new HashMap<>();
		mymap.put(1, "Chetan");
		mymap.put(2, "Vijay");
		Set<Integer> set = mymap.keySet();
		for ( int i : set) {
		System.out.println(i +  "  " + mymap.get(i));
		}
		Set<Map.Entry<Integer, String>> set1 = mymap.entrySet();
		for (Map.Entry<Integer, String> i : set1){
			System.out.println(i.getKey() +  "  " + i.getValue());
		}
		
	
		
		
		

	}

}
