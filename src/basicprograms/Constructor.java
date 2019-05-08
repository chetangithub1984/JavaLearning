package basicprograms;

public class Constructor {

	public static void main(String[] args) {
	
		ABCD obj = new ABCD (5,8, "Chetan") ;
		System.out.println(obj.i);
	
	}

}

class ABCD {
	int i;
	public  ABCD (int b, int c, String CD) {
		i = b;
		System.out.println("I am in default constructor");
	}
	
}
