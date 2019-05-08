package basicprograms;

public class ThisKeyword {

	public static void main(String[] args) {
		ThisUsage obj = new ThisUsage(5);
		System.out.println(obj.i);
	}

}

class ThisUsage {
	
	int i ;
	
	ThisUsage (int i) {
	this.i = i;
	}
	
}
