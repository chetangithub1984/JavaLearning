package exceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		int i = 10 ;
		int j = 0;
		int k = 0 ;
		try {
		k = i/j;
		}
		catch (ArithmeticException ae) {
			System.out.println("you are dividing number by zero");
			System.out.println(ae.getMessage());
		}
		
		try { 
		int arr [] = new int [3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		for ( int r : arr ) {
			
			System.out.println(r);
		}
		
		}
		
		catch (ArrayIndexOutOfBoundsException swati) {
			System.out.println("array out of bound");
		}
		
		System.out.println(k);
		
		

	}

}
