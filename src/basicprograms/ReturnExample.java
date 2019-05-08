package basicprograms;

public class ReturnExample {
	
	int i = 5;

	public static void main(String[] args) {
	
		ReturnExample obj = new ReturnExample();
		
		System.out.println(obj.mtd());
	}
	
	public int mtd () {
		
		//System.out.println("Hi");
		return i;
	}

}
