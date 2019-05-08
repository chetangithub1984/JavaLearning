package stringexample;

import java.util.Scanner;

public class Stringconversion {

	public static void main(String[] args) {

		// integer to string conversion
/*     int a = 10 ;
     String s = String.valueOf(a);
     System.out.println(10 + s);*/
     
     // String to integer conversion
		int a ;
		int b ;
		int c ;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
	   String s = 	scan.nextLine();
	   String s1 = scan.nextLine();
	   
	   
	   // String to Integer conversion
	   a = Integer.parseInt(s);
	   b = Integer.parseInt(s1);
	   c = a + b;
	   System.out.println(c);
	  
	}

}
