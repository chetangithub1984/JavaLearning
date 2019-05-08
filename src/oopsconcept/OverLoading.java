package oopsconcept;

public class OverLoading {

	public static void main(String[] args) {
		OverLoad obj = new OverLoad() ;
		obj.area(6);
		obj.area(3, 4);

	}

}

class OverLoad {   // method over loading , static binding , compile time polymorphism
	
	public void area (int length , int width) {
		
		int areaofRectangle = length * width ;
		System.out.println("area of rectangle - : " + areaofRectangle);
		
	}
	
	public void area (int radius)  {
		double areaOfCircle = 3.14 * (radius*radius) ;
		System.out.println("Area of Circle : - " + areaOfCircle);
	}
	
}
