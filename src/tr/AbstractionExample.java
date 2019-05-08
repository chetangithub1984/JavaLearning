package tr;

public class AbstractionExample {

	public static void main(String[] args) {
		Iphone1 obj = new Iphone1();
		Samsung1 obj1 = new Samsung1();
		show(obj1);
		
	}
	public static void show(phone1 obj) {
	obj.showconfig();
}

	/*public static void show(Iphone1 obj) {
		obj.showconfig();
	}

	public static void show(Samsung1 obj) {

		obj.showconfig();
	}*/
}

abstract class phone1 {
	abstract void showconfig();

}

class Iphone1 extends phone1 {

	public void showconfig() {
		System.out.println("IOS 11");

	}

}

class Samsung1 extends phone1 {

	public void showconfig() {
		System.out.println("Naugat");
	}
}
