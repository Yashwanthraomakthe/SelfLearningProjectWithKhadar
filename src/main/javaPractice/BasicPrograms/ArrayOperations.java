package BasicPrograms;

import static org.testng.Assert.assertNotSame;

import java.util.Arrays;

import org.testng.annotations.Test;

/*
 *  Arrays.asList() method 
 *  Arrays.binarySearch(argument, key)
 *  Arrays.compare() method 
 *  Arrays.compareUnsigned() --compares two arrays lexicographically, numerically treating elements as unsigned.
 *  Arrays.copyOf() --copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
 *  Arrays.copyOfRange()
 *  Arrays.deepEquals()
 *  Arrays.deepHashCode()
 *  Arrays.deepToString()
 *  Arrays.equals() 
 *  Arrays.sort()
 */
public class ArrayOperations {

	// --------------------------------------------------------------------------------------------------//
	@Test(enabled = false)
	public void combineArraysUsinArrayCopy() {

		int[] a = { 3, 4, 6, 2, 1 };
		int[] b = { 9, 8, 6, 3, 7 };

		// Concatenate Two Arrays using arraycopy function

		int alength = a.length;
		int blength = b.length;

		int[] abarray = new int[a.length + b.length];

		System.arraycopy(a, 0, abarray, 0, alength);
		System.arraycopy(b, 0, abarray, alength, blength);

		System.out.println(Arrays.toString(abarray));

		Arrays.sort(abarray);// sorting array

		System.out.println(Arrays.toString(abarray));

	}
//-----------------------------------------------------------------------------------------------------------//

	@Test(enabled = false)
	public void combineArrayWithoutBuitinmethods() {
		int[] array1 = { 1, 8, 3 };
		int[] array2 = { 4, 7, 6 };

		int length = array1.length + array2.length;

		int[] result = new int[length];
		int pos = 0;
		for (int element : array1) {
			result[pos] = element;
			pos++;
		}

		for (int element : array2) {
			result[pos] = element;
			pos++;
		}

		System.out.println(Arrays.toString(result));
	}

//-------------------------------------------------------------------------------------------------//	

	@Test(enabled = false)
	public void arrayRevers() {
		int[] orgar = { 1, 2, 3, 4, 5 };

		int arrayLength = orgar.length;
		System.out.println(arrayLength);

		for (int i = arrayLength - 1; i >= 0; i--) {
			System.out.print(orgar[i]);

		}

	}
//------------------------------------------------------------------------------------------------//

	@Test(enabled = false)
	public void avrgOfArrayElements() {

		int[] arrayNumbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int avg = 0;
		int arrayLeangth = arrayNumbers.length;
		for (int i = 0; i < arrayLeangth; i++) {
			sum = sum + arrayNumbers[i];
		}

		avg = sum / arrayLeangth;
		System.out.println("Avarage of array Numbers is " + avg);

	}

	// ---------------------------------------------------------------------------------------------------------//
	@Test(enabled=false)
	public void reversArrayElementsWithMethods() {

		int[] arrayNumbers = { 1, 5, 8, 4, 2 };
		System.out.println("Original Array elements" + Arrays.toString(arrayNumbers));
		Arrays.sort(arrayNumbers);
		System.out.println("Sorted Array elements" + Arrays.toString(arrayNumbers));

	}

	// ---------------------------------------------------------------------------------------------------------//

	@Test(enabled=false)
	public void reversArrayElementsWithoutmethods() {

		int[] a = { 1, 5, 1, 4, 2 };
		System.out.println("Original Array elements" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("Sorted Array elements" + Arrays.toString(a));

	}

	// ---------------------------------------------------------------------------------------------------------//
	
	@Test()
	public void test() {
		String s1= new String("abc");
		String s2= new String("abc");
	 assertNotSame(s1,s2);
		
	}
	
}
