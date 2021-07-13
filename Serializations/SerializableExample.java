package Serializations;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExample implements Serializable
{
	  String name;
	  int age;

	  //constructor
	  public SerializableExample(String name, int age)
	  {
	    this.name=name;
	    this.age=age;
	  }

	  
	  public void details()
	  {
	    System.out.println("Name of student: "+this.name+"\nAge of student: "+this.age);
	  }
	

	
	  public static void main(String []args)
	  {
	    try
	    {
	    	SerializableExample s1=new SerializableExample("Abhinandan",18);
	      s1.details();

	      
	      FileOutputStream f=new FileOutputStream("Object.txt");
	      ObjectOutputStream op=new ObjectOutputStream(f);
	      op.writeObject(s1);   
	      op.flush();           
	      System.out.println("Object state saved");
	      op.close();           
	    }
	    catch(Exception e)
	    {
	      System.out.println("Exception occured");
	    }
	  }
	}