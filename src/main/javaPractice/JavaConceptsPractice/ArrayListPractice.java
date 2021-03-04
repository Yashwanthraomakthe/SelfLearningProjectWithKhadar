package JavaConceptsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> List = new ArrayList<String>();
		List.add("Yash");
		List.add("Pooja");
		List.add("Dinky");
		List.add("Rahul");
		List.add(" ");
		
		System.out.println("Original List elements " + List);
		Collections.sort(List);
		System.out.println("Sorted List elements " + List);
		
		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("Yash");
		List1.add("Pooja");
		List1.add("Dinky");
		List1.add("Rahul");
		
		List.addAll(List1);
		System.out.println("Combning 2 Arraylist elemenets " + List);
		
		Collections.sort(List);
		System.out.println("Combined sorted list" + List);
		
		
		

	}

}
