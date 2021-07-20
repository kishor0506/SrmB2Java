package Collections;

import java.util.LinkedList;

public class Concat {
	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);

		LinkedList<Integer> concatenated_list = new LinkedList<Integer>();

		concatenated_list.addAll(list1);
		concatenated_list.addAll(list2);

		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println("Concatenated list: " + concatenated_list);
	}
}
