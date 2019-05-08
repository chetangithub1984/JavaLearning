package oopsconcept;

public class AbstractExample2 {

	public static void main(String[] args) {

		Amit obj = new Amit();
		obj.calling();
		obj.message();
		obj.camera();

	}

}

abstract class Swati {

	public void calling() {
		System.out.println("calling");
	}

	abstract public void message();

	abstract public void camera();
}

abstract class Vinay extends Swati {
	public void message() {
		System.out.println("Message");
	}
	// abstract public void camera() ;

}

class Amit extends Vinay {

	public void camera() {
		System.out.println("Camera");
	}

}
