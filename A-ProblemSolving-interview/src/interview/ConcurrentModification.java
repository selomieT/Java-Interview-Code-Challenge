package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModification {

	public static void main(String[] args) {
		// concurent modification

		Map<String, String> map = new HashMap<>();
		map.put("1", "value1");
		map.put("2", "value2");
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
			map.put("3", "value3");// concurrentModificationException // to solve the use concurrentHAshMap

		}

		/*
		 * Map<String, String> map = new ConcurrentHashMap<>(); map.put("1", "value1");
		 * map.put("2", "value2"); Iterator<String> iterator = map.keySet().iterator();
		 * while (iterator.hasNext()) { System.out.println(map.get(iterator.next()));
		 * map.put("3", "value3");// concurrentModificationException // to sove the //
		 * problem use concurrent hashMap }
		 */

	}

}
