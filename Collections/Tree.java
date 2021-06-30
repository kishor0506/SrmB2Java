package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

	public static int recurSum(int a) {
		if (a <= 1)
			return a;
		return a+ recurSum(a- 1);
	}

	public static void main(String[] args) {
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);

		int sum = 0;
		for (Integer i : a) {
			sum = sum + i;
		}
		System.out.println("===for loop method===:" + sum);
		sum = 0;
		Iterator itr = a.iterator();

		while (itr.hasNext()) {
			int i = (int) itr.next();
			sum = sum + i;
		}
		System.out.println("===while loop method===:" + sum);
		System.out.println("===Recursion method===:");
		
		 for(

					Integer i:a)
					{
						System.out.println(Tree.recurSum(i));
					}
	}

}


