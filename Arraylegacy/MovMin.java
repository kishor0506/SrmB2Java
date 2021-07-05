package Arraylegacy;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MovMin {

	public static void main(String[] args) 
	{
		try {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("kumar");
		list.add("kishor");
		list.add("srinath");
		list.add("tamil");
		list.add("niranjan");
		System.out.println("ArralyListElements: "+list);
		for(String i:list) 
		{
			int l=i.length();
			if(l%2==0) 
			{
				list.remove(i);
			}
		}
		System.out.println("After Remove Operation(using CopyOnWriteArrayList): "+list);
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("kumar");
		arr.add("kishor");
		arr.add("srinath");
		arr.add("tamil");
		arr.add("niranjan");
		System.out.println("ArralyList Elements: "+arr);
		for(String i:arr) 
		{
			int l=i.length();
			if(l%2==0) 
			{
				arr.remove(i);
			}
		}
		System.out.println("After Remove Operation: "+arr);
		}
		catch(Exception e){
			System.out.println(e);		}
		
	}
}
