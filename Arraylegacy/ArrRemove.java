package Arraylegacy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrRemove {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arrl=new ArrayList<Integer>();
		System.out.println("Enter Size: ");
		int n=sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) 
		{
			arrl.add(sc.nextInt());
		}
		int min=arrl.get(0);
		int mindex=0;
		for(int i=0;i<n;i++)
		{
			if(arrl.get(i)<min)
			{
				min=arrl.get(i);
				mindex=i;
			}
		}
		arrl.remove(mindex);
		arrl.add(0,min);
		System.out.println("After Re-arranging : "+arrl);
	}
}
