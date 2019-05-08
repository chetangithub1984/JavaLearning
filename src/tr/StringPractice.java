package tr;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
	 String S1 , S2 ,S3;
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the 2 numbers : - ");
	 S1 = scan.nextLine();
	 S2 = scan.nextLine();
	 S3 = S1.concat(S2);
	 System.out.println(S3);
	}

}
