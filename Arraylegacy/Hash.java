package Arraylegacy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hash {
	public static void main(String[] args)
	{
		HashSet<ArrayList> hs=new HashSet<ArrayList>();
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("kishor");
		arr1.add("srinath");
		arr1.add("lokesh");
		
		ArrayList<MyOwnClass> arr2=new ArrayList<MyOwnClass>();
		arr2.add(new MyOwnClass("kishor",24));
		arr2.add(new MyOwnClass("srinath",25));
		arr2.add(new MyOwnClass("lokesh",23));
		
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.add(5);
		arr3.add(6);
		arr3.add(4);
		arr3.add(2);
		arr3.add(1);
		
		hs.add(arr1);
        hs.add(arr2);
        hs.add(arr3);
        
        Iterator itr = hs.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
	}
}
