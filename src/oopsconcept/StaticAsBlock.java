package oopsconcept;

public class StaticAsBlock {
	
	static int i;
	
	static {
		i = 10;
		System.out.println("Static block invoked");
	}

	public static void main(String[] args) {
		
		StaticAsBlock obj = new StaticAsBlock();
		i = 10;
	 
		

	}

}
