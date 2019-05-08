package oopsconcept;

public class StaticasMethod {

	public static void main(String[] args) {
		
		//StaticasMethod1 obj = new StaticasMethod1() ;
		StaticasMethod1.show();
	}

}

class StaticasMethod1 {
	
	static int i = 8;
	
	public   static void show () {
		i++;
		System.out.println("Hi");
	}
}
