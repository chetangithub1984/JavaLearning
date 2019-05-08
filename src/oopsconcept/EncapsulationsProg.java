package oopsconcept;

public class EncapsulationsProg {

	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.setter(2000);
		System.out.println(obj.getter());
	}
}
class Encap {
private int currBalance = 5000;
public void setter(int withdraw) {
		currBalance = currBalance - withdraw;
	}

	public int getter() {
		return currBalance;

	}
}
