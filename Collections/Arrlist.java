package Collections;

import java.util.ArrayList;

public class Arrlist {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(15);
		arr.add(17);
		arr.add(18);

		int min = arr.get(0);
		int max = arr.get(0);
		int n = arr.size();
		for (int i = 1; i < n; i++) {
			if (arr.get(i) < min) {
				min = arr.get(i);
			}
		}
		for (int i = 1; i < n; i++) {
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
			System.out.println("Maximum is : " + max);
			System.out.println("Minimum is : " + min);
		}

	}

}
