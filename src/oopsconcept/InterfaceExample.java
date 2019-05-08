package oopsconcept;

public class InterfaceExample {

	public static void main(String[] args) {
	
     A obj = new C() ;
     obj.show();
     
		

	}

}

interface A {
	
	default void show() {
		System.out.println("I am in A");
	}
	
}

interface B extends A {
	default void show() {
		System.out.println("I am in B");
	}
}

class C implements A,B {

	@Override
	public void show() {
		System.out.println("I am in c");
		
	}
	
	public void show1 () {
		System.out.println("show1");
	}
	
}
