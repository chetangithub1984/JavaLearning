package tr;

import java.util.Random;

public class AaaraysExample {

	public static void main(String[] args) {
		
		int arr [] []= new int [3] [3];
		Random rand = new Random() ;
		
		for ( int i = 0 ; i < arr.length ; i ++ ) {
			for ( int j = 0 ; j<3 ; j++) {
		arr [i] [j]= rand.nextInt(50);
		}
		}
		
		for ( int[] i : arr) {
			for ( int j : i) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		
		

	}

}
