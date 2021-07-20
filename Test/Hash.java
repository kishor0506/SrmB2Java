package Test;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();

		hset.add("kishor");
		hset.add("srinath");
		hset.add("kumar");
		hset.add("loki");

		System.out.println("HashSet contains: " + hset);

		String[] array = new String[hset.size()];
		hset.toArray(array);

		System.out.println("Array elements: ");
		for (String temp : array) {
			System.out.println(temp);
		}
	}
}
