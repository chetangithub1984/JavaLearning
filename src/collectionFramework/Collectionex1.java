package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collectionex1 {

	public static void main(String[] args) {

		List<Integer> col = new LinkedList<>();

		col.add(56);
		// col.add("Chetan");
		// col.add(3.4f);
		col.add(8);
		col.add(2);
		col.add(34);

		// col.add(1,7);
		// col.remove(3);

		Collections.sort(col);
		// Collections.reverse(col);

		Iterator itr = col.iterator();

		/*while (itr.hasNext()) {
			System.out.println(itr.next());

		}
*/
		for (Object vinay : col) {
			System.out.println(vinay);
		}

	}

}
