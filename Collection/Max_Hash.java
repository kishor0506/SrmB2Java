package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Max_Hash {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 50);
		map.put(2, 12);
		map.put(3, 30);
		map.put(4, 52);
		map.put(5, 60);
		System.out.println("LARGEST KEY IN HASHMAP:");
		int maxkeyInMap = (Collections.max(map.keySet()));
		System.out.println(maxkeyInMap);
		System.out.println("SMALLEST VALUE IN HASHMAP:");
		int minValueInMap = (Collections.max(map.values()));
		System.out.println(minValueInMap);
	}

}
