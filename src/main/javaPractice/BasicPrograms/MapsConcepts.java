package BasicPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class MapsConcepts {

	// @Test()
	public void addElements() {
		HashMap m = new HashMap();
		m.put(1, "AJay");
		m.put(1, "krishna");
		m.put(1, "Yashwanth");// output 1 yashwanth

		System.out.println(m);

	}

//---------------------------------------------
	//@Test()
	public void MapBasics() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Yash");
		map.put(102, "Pooja");
		map.put(103, "Dinky");
		map.put(104, "Rahul");

		System.out.println("Original Map content " + map);

		System.out.println("All Keys " + map.keySet());
		System.out.println("All Values " + map.values());

		System.out.println(" Map Entry set" + map.entrySet());

		Set keys = map.entrySet();
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "---------" + m1.getValue());
			if (m1.getKey().equals(102)) {
				System.out.println("Value for 102 " + m1.getValue());
			}
		}
	}

	// ---------------------------------------------------------------------------------

	@Test()
	public void KeyValueAssosiation() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Yash");
		map.put(102, "Pooja");
		map.put(103, "Dinky");
		map.put(104, "Rahul");

		System.out.println("Original Map content " + map);

		System.out.println("Map Size" + map.size());
		for(Map.Entry x:map.entrySet()) {
			System.out.println(x.getKey() + "-----" + x.getValue());
		}
	}
	
	//---------------------------------------------------------------------------------
}