package basicprograms;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		
		int i = 5;
		int temp;
		//int j ;
		//i = i + 1;
	//	i++;  // post increment   o/p - 6   ... First it will assign the value and then it will increment
		//++i ; // pre increment  o/p  - 6  .. First it will increase the value and then assign it
		
		//i = i++;  o/p  - 5
	//	i = ++i;   o/p - 6
		//j = i++;
		// i = i + 1;
		  int j   = i++;
			System.out.println(j);
		 j = i + 1;
			System.out.println( j);
		/* temp = i;
		 i = i + 1;
		 i  = temp;*/
		

		
		

	}

}
