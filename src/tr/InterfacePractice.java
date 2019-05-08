package tr;

public class InterfacePractice {

	public static void main(String[] args) {
		
		A obj = new C () ;
		obj.show();
		
}
}
interface A {

	default void show() {
		System.out.println("A");
	}
}

class B {
	
	public void show() {
		System.out.println("B");
	}
}

class C extends B implements A{
	
/*	public void show() {
		System.out.println("C");
	}*/
	
}

