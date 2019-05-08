package basicprograms;

public class Thisasmethod {

	public static void main(String[] args) {

		ThisUsage1 obj = new ThisUsage1();
		obj.mtd2();
	}

}
class ThisUsage1 {
	int i ;
	public void mtd1 () {
		System.out.println("I am in method 1");
	}
	public void mtd2 () {
		this.mtd1();
		System.out.println("I am in method 2");
	}
	
	
}
