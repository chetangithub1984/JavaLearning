package arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
      
		//int arr [ ] = new int [4];
		int arr [ ] = {1,2,3,4};     // 
		
	/*	arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;*/
		
		System.out.println("length of array = " + arr.length);
		
		/*for ( int i = 0 ; i <arr.length  ; i ++) {
			
			System.out.println(arr[i]);
		}*/
		
		for ( int i : arr) {                       // advance for loop
			System.out.println(i);
		}

	}

}
