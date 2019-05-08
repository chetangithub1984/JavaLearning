package oopsconcept;

public class StaticExample {

	public static void main(String[] args) {
		Satticincrement obj = new Satticincrement();  
		Satticincrement obj1 = new Satticincrement();
	
	}

}

class Satticincrement {
	
	static  int i = 0;
	
	Satticincrement () {
		i++;
		System.out.println(i);
	}
	
}
