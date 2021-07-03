package collections2;

import java.util.Hashtable;

public class Hash {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Three");
		ht.put(4, "Four");
		ht.put(5, "Five");
		ht.put(6, "Six");

		System.out.println("Displaying entries in hash table: " + ht);
		int size = ht.size();
		System.out.println("Size of hash table: " + size);

		String removeE = ht.remove(6);
		System.out.println("Removed entry: " + removeE);
		System.out.println("Updated entries in hash table: " + ht);

		String getValue = ht.get(4);

		System.out.println("Getting the value of 4: " + getValue);
		System.out.println("Getting the value of 2: " + ht.get(2));
	}
}
