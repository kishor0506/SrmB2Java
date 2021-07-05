package Arraylegacy;

import java.util.Scanner;
import java.util.TreeSet;

public class DupArray {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array: ");
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
		}
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(Integer i:arr)
		{
			if(!ts.add(i))
			{
				System.out.println("The Duplicate Element: "+i);
			}
		}
		System.out.println("TreeSet Elements: "+ts);
	}
}
