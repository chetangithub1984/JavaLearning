package oopsconcept;

public class Interfaceexample1 {

	public static void main(String[] args) {
		parent2 obj = new child2 ();
		obj.show();
	
	
	}
}

/*interface D {

		void show () ;
	
}

class ABS implements D {

	@Override
	public void show() {
		System.out.println("Hello World");
		
	}
	
	public void show1 () {
		System.out.println("Hello");
	}
}*/

class parent2{
	public void show () {
		System.out.println("Hi I am in paent ");
	}
}


class child2 extends parent2{
	public  void show () {
		System.out.println("I am in child");
	}
}