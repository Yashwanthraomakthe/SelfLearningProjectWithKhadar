package BasicPrograms;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

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

	public static ArrayList<String> removeDuplidates(ArrayList<String> List) {
		ArrayList<String> newList = new ArrayList<String>();

		for (String element : List) {

			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		return newList;

	}

}
