package exceptionHandling;

public class FinallyBlockExample {

	public static void main(String[] args) {
		int i = 10 ;
		int j = 0;
		int k = 0 ;
		try {
		k = i/j;
		System.out.println(k);
		
		}
		
		catch (ArrayIndexOutOfBoundsException ao) {
			System.out.println("Array out of bound");
		}
		
		finally {
			System.out.println("finally always executed");
		}

	}

}
