package tasks;

import java.util.*;
public class ConvertingListtoArray {

	public static void main(String[] args) {
		ArrayList Cars = new ArrayList<>();
		
		Cars.add("Ferrari");
		Cars.add("Lamborghini");
		Cars.add("Mclaren");
		System.out.println("ArrayList" + Cars);
		
		String[] arr = new String[Cars.size()];
		
		Cars.toArray(arr);
		System.out.print("Array: ");
		for(String item:arr) {
			System.out.print(item+", ");
		}

	}

}
