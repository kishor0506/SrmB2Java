package Generics;

import java.util.LinkedList;
import java.util.Queue; 

public class queue {
	 public static void main(String[] args) 
	  { 
	    Queue<Integer> a = new LinkedList<>(); 
	    for (int i=0; i<10; i++) 
	a.add(i); 
	System.out.println("**************************************");
	System.out.println("Elements of Queue : "+a); 
	System.out.println("**************************************");
	int b= a.remove(); 
	System.out.println("Removed element from the Queue : " + b); 
	System.out.println(a); 
	System.out.println("**************************************");
	int c = a.peek(); 
	System.out.println("head of queue=" + c); 
	System.out.println("**************************************");
	int d= a.size(); 
	System.out.println("Size of queue=" + d); 
	  } 
	}


