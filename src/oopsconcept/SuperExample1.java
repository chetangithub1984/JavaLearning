package oopsconcept;

public class SuperExample1 {

	public static void main(String[] args) {
		EDF obj = new EDF();
		obj.show();

	}

}

class ADS {
	int i = 9 ;
	public void mtd () {
		System.out.println("I am in parent class method");
	}
}

class EDF extends ADS {
	int i = 8;
	public void show () {
		System.out.println(i);
		super.mtd();
	}
}
