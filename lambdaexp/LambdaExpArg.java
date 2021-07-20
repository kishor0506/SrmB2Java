package lambdaexp;

import java.util.ArrayList;
import java.util.Scanner;

public class LambdaExpArg {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println("Passing LAmbda Exp as Argument...");
        names.add("zack");
        names.add("addy");
        names.add("ryan");
        names.add("jack");
        names.add("sam");
        System.out.println("ArrayList: " + names);
        names.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + names);

	}
}
