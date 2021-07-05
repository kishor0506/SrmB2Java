package Arraylegacy;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashIterator {
	public static void main(String[] args) {
		Hashtable<Integer,Double> ht=new Hashtable<Integer,Double>();
		ht.put(1001,50000.25);
		ht.put(1002,80000.25);
		ht.put(1003, 45256.98);
		ht.put(1004,20000.10);
		ht.put(1005,7423.52);
		System.out.println("Account Information HashTable...");
		Set<Integer> s = ht.keySet();
	    Iterator<Integer> itr =s.iterator();
	    while (itr.hasNext()) 
	    { 
	       int i = itr.next();
	       System.out.println("Key: "+i+", Value: "+ht.get(i));
	    }

	}
}
