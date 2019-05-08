package oopsconcept;

public class AbstractionExample {

	public static void main(String[] args) {
		Samsung obj = new Samsung() ;
		show(obj);
	}
	public static void show (phone obj ) {
		
		obj.showconfig();
	}
}
abstract class phone {
	
	abstract public void showconfig();
}
class Iphone extends phone{

public void showconfig() {
		System.out.println("IOS 11");
		
	}

}
class Samsung extends phone {
	
	public void showconfig () {
		System.out.println("Naugat");
	}
}

