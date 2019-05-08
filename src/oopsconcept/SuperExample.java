package oopsconcept;

public class SuperExample {

	public static void main(String[] args) {
		
		Child obj = new Child(4) ;
	}

}

class Parent extends Object {
	
	Parent() {
		super();
		System.out.println("I am in parent default constructor");
	}
	
	Parent (int a) {
		super();
		System.out.println("I am in parent parameterized constructor");
	}
	
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("I am in child default constructor");
	}
	Child (int a) {
		super();
		System.out.println("I am in child parameterized constructor");
	}
}
