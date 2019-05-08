package exceptionHandling;

public class ThrowExample {

	public static void main(String[] args) {
		 int age = 20;
		 if ( age < 18) {
			 throw new ArithmeticException("Age is not valid");
		 }
		 
		 System.out.println("age is valid");
		 
	

	}

}
