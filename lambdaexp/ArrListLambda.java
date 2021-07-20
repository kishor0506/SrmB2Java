package lambdaexp;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListLambda {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of ArrayList: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n;i++)
	    { 
	    	arr.add(sc.next());
	    }
	    System.out.println("Display Arraylist (Using lambda exp): ");
	    System.out.println("************************************");
	    arr.forEach((e)->{
	    	System.out.print(e+" ");
	    });
         
	}

}
