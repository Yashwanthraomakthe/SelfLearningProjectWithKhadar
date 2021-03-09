package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ListConceptsPractice {

	// @Test()
	public void addTwoArrayLists() {

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
//---------------------------------------------------------------------------------------------------

	// @Test()
	public void removeDuplicates() {

		ArrayList<String> List = new ArrayList<String>();
		List.add("Yash");
		List.add("Pooja");
		List.add("Dinky");
		List.add("Rahul");
		List.add("Yash");
		List.add("Pooja");
		List.add("Dinky");
		List.add("Rahul");

		System.out.println("ArrayList With Duplicate elements " + List);

		ArrayList<String> newList = removeDuplidates(List);
		System.out.println("Duplicates removed from arrayList " + newList);

	}

	public ArrayList<String> removeDuplidates(ArrayList<String> List) {
		ArrayList<String> newList = new ArrayList<String>();

		for (String element : List) {

			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		return newList;

	}

	// -------------------------------------------------------------------------------------------------

	// @Test()
	public void ListOperations() {

		ArrayList<String> List = new ArrayList<String>();
		List.add("Yash");
		List.add("Pooja");
		List.add("Dinky");
		List.add("Rahul");
		List.add(" ");

		System.out.println("Original List elements " + List);
		Collections.sort(List);
		System.out.println("Sorted List elements " + List);

		for (String element : List) {
			System.out.println("Printing using Iteration " + element);
		}

		List.add(0, "Sachin");
		System.out.println("Original List elements " + List);

		List.set(0, "Rahul");
		System.out.println("Original List elements " + List);

	}

	// ---------------------------------------------------------------------------------------

	// @Test()
	public void copyArrayElements() {

		ArrayList<String> List = new ArrayList<String>();
		List.add("Yash");
		List.add("Pooja");
		List.add("Dinky");
		List.add("Rahul");

		System.out.println("Original List elements " + List);

		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("Yash111");
		List1.add("Pooja111");
		List1.add("Dinky111");
		List1.add("Rahul111");

		System.out.println("Original List elements " + List1);

		Collections.copy(List, List1);
		System.out.println("Combning 2 Arraylist elemenets " + List);
		Collections.shuffle(List);
		System.out.println("Combning 2 Arraylist elemenets " + List);

	}

	// ------------------------------------------------------------------------------------------

	// @Test()
	public void ListElementsSearch() {

		ArrayList<String> List = new ArrayList<String>();
		List.add("Yash");
		List.add("Pooja");
		List.add("Dinky");
		List.add("Rahul");

		System.out.println("Original List elements " + List);

		if (List.contains("Pooja")) {
			System.out.println("Given element is present in list");
		} else
			System.out.println("Given element is not present");

	}

	// -----------------------------------------------------------------------------------------

	// @Test()
	public void reversListElmennts() {

		ArrayList<String> List = new ArrayList<String>();
		ArrayList<String> revList = new ArrayList<String>();
		List.add("Yash");
		List.add("Pooja");
		List.add("Dinky");
		List.add("Rahul");

		System.out.println("Original List elements " + List);

		Collections.reverse(List);
		System.out.println("Reverse List elements using built in methods " + List);
		Collections.reverse(List);
		System.out.println("Original List elements " + List);

		for (int i = List.size() - 1; i >= 0; i--) {
			String name = List.get(i).toString();
			revList.add(name);
			System.out.println(name);

		}
		System.out.println("Reversed ArrayList " + revList);
	}

	// ------------------------------------------------------------------------------------------
	 @Test()
	public void ArrayListtoArrayConversion() {

		ArrayList<String> List = new ArrayList<String>();

		List.add("Yash");
		List.add("Pooja");	
		List.add("Dinky");
		List.add("Rahul");

		System.out.println("Original List elements " + List);
		Object s =List.toArray();
		
		System.out.println("Array Elements" + List.toArray());

	}
}
