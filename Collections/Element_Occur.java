package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Element_Occur {
	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of LinkedList: ");
		int n=sc.nextInt();
		System.out.println("Enter the Elements: ");
	    for(int i=0;i<n;i++)
	    { 
	    	list.add(sc.nextInt());
	    }
	    System.out.println("LinkedList: "+list);
	    System.out.println("Does LinkedList contains element : "+list.contains(50));    
	}
	
	
		
}
