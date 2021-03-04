package JavaConceptsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsConcepts {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Yash");
		map.put(102, "Pooja");
		map.put(103, "Dinky");
		map.put(104, "Rahul");
		
		System.out.println("Original Map content " + map);
		
		System.out.println("All Keys " +map.keySet());
		System.out.println("All Values " +map.values());
		
		System.out.println(" Map Entry set" + map.entrySet());
		
		Set keys = map.entrySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() +"---------"+ m1.getValue());
			if(m1.getKey().equals(102)) {
				System.out.println("Value for 102 " +m1.getValue());
			}
		}
		

	}

	
	
}
