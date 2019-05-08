package exceptionHandling;

public class MultipleCatchExample {

	public static void main(String[] args) {

		int i = 10;
		int j = 5;
		int k = 0;
		try {
			k = i / j;
			int arr[] = new int[3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;

			for (int r : arr) {

				System.out.println(r);
			}
		}

		catch (ArrayIndexOutOfBoundsException ao) {
			System.out.println("array out of bound");
		}

		catch (ArithmeticException ae) {
			System.out.println("divide by zero");
		}

		catch (Exception ae) {
			System.out.println("some exception occured");
		}

		System.out.println(k);

	}

}
