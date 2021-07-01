package Collection;

import java.util.HashMap;
import java.util.Set;

public class Hash {

	public static void main(String a[]) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("skoda", "Octavia");
		hm.put("honda", "Accord");
		hm.put("Hyundai", "Elantra");
		System.out.println(hm);
		  System.out.println("The key of hashmap is : ");
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		  System.out.println("The value of hashmap is: " + hm.values());
		}
	}
