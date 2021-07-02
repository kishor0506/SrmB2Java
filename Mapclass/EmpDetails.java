package Mapclass;

import java.util.Map;
import java.util.TreeMap;


public class EmpDetails {
	public static void main(String[] args) {
		Emp e= new Emp(1001,"loki","Senior Dev");
		Emp e1= new Emp(1002,"kumar","Programmer");
		Emp e2= new Emp(1003,"srianth","Team Lead");
		Emp e3= new Emp(1004,"kishor","Trainee");
		
		TreeMap<Integer,Emp> tm=new TreeMap<Integer,Emp>();
		tm.put(1,e);
		tm.put(2,e1);
		tm.put(3,e2);
		tm.put(4,e3);
		System.out.println("Emp Details: ");
		for(Map.Entry<Integer,Emp> i:tm.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		System.out.println("\nFirst Record: "+tm.get(1));
		System.out.println("\nEmp Record with Id(1003): "+tm.get(3));
	}
}

