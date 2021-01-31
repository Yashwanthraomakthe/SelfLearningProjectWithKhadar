package BasicPrograms;

import java.util.Arrays;

public class SortInArray {

	// Using Sort method in Arrays class
	public static void main(String[] args) {

		int[] array = { 5, 2, 3, 6, 7 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		System.out.println();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
System.out.println("**************************************");
	
		
		
		
	}
}
