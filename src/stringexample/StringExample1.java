package stringexample;

public class StringExample1 {

	public static void main(String[] args) {
	
		String name = "ChetanPatel";
		String name2 = "Patel";
		String name1 = new String ("Chetan");
		//System.out.println(name.equals(name2));
		//System.out.println(name.equalsIgnoreCase(name2));
		//System.out.println(name1==name2);
		//name = name + "Patel" ; 
		//System.out.println(name);
		
		System.out.println(name.substring(6));
		System.out.println(name.substring(1, 4));
		if ( name.substring(6).equals("Patel")) {
			System.out.println("given string is sub string of main string");
		}
			else {
				System.out.println("None");
			}
		}
		

	}


