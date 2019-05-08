package basicprograms;

public class ThisasConstrucor {

	public static void main(String[] args) {
		ThisUsage2 obj = new ThisUsage2();

	}

}
class ThisUsage2 {
	
	int i ;
	
	ThisUsage2() {
		this(5);
		System.out.println("I am in default cons");
	}
	ThisUsage2 (int i) {
		
		System.out.println("I am in parameterized cons"  + i);
	}
	
}
