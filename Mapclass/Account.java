package Mapclass;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Account {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,Double> tmap=new TreeMap<Integer,Double>();
		tmap.put(20001120, 25000.00);
		tmap.put(20001178, 40789.35);
		tmap.put(20001108, 15000.20);
		tmap.put(20001170, 80000.00);
		tmap.put(20001200, 45000.00);
		
		System.out.println("Account Information ");
		System.out.println("********");
		System.out.println(tmap);
		System.out.println(" \n Enter Acc.No: ");
		int a=sc.nextInt();
		if(tmap.containsKey(a))
		{
			System.out.println(" \n Retrive Account balance("+a+"): "+tmap.get(a));
		}
		else
		{
			System.out.println("\n Account Information Not found...");
		}
	}
}
