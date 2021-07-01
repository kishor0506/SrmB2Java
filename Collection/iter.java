package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iter {
	 public static void main(String[] args)
	  {
	    ArrayList< String> ar = new ArrayList< String>();
	    ar.add("Kishor");
	    ar.add("Srinath");
	    ar.add("Lokesh");
	    ar.add("Tamil");
	    Iterator it = ar.iterator();    
	    while(it.hasNext())
	    {  
	      System.out.println(it.next()+" ");
	    }
	    
	    System.out.println("-------------------------------------------- ");
	    System.out.println("LIST ITERATOR:");
	    ListIterator litr = ar.listIterator();
	    while(litr.hasNext())   //In forward direction
	    {
	      System.out.println(litr.next()+" ");
	    }
	    System.out.println("-------------------------------------------- ");
	    System.out.println("Backward:");
	    while(litr.hasPrevious())   //In backward direction
	    {
	    
	      System.out.println(litr.previous()+" ");
	    }
	  }
}
	  
