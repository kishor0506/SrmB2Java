package Mapclass;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneMap {
	public static void display(TreeMap<String, Integer> tmapt) {
		for (Map.Entry<String, Integer> e : tmapt.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("kishor",97105260);
		tmap.put("loki", 40115478);
		tmap.put("srianth", 87455478);
		System.out.println("The Phone Directory: ");
		System.out.println("********");
		display(tmap);
		System.out.println("\nTo retrive number for specified Name: ");
		String s1 = sc.next();
		if (tmap.containsKey(s1)) {
			System.out.println("PhoneNumber: " + tmap.get(s1));
		} else {
			System.out.println("Name not Found...");
		}
		System.out.println("\nTo specify number for given Name: ");
		String s = sc.next();
		if (tmap.containsKey(s)) {
			System.out.println("Old PhoneNumber:" + tmap.get(s));
			tmap.replace(s, 54781001);
			System.out.println("Updated PhoneNumber: " + tmap.get(s));
			System.out.println("\nDirectory (Post Updation): ");
			display(tmap);
		} else {
			System.out.println("Name not Found...");
		}
	}
}
