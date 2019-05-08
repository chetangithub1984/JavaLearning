package practice;

public class Experiment {
	public static void main(String[] args) {
	
		abstraat1 obj = new BF(5);
		obj.mtd();
	}
	

}

abstract class abstraat1 {
	
	abstraat1 (int a) {
		
		System.out.println("abstract class initialized" + a);
	}
	
	abstract void  mtd () ;
}

class BF extends abstraat1 {

	BF(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	void mtd() {
	
		System.out.println("Hello");
		
	}
	
}