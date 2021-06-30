package Collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Replace {

	public static void main(String[]args) {
		ArrayList<Integer>list= new ArrayList<Integer>();
		list.add(10);
		list.add(29);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("Before replacing");
		for (int i:list) {
			System.out.println(i);
		}
		   ListIterator<Integer> iterator = list.listIterator();
		   iterator.next();
		   iterator.set(05);
		   
		   System.out.println("after replacing");
		   for (int i : list) {
	            
	            System.out.println(i);
	            
	        }
		   
		   
	}
}