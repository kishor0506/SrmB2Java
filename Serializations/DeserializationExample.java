package Serializations;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeserializationExample implements Serializable
{
	  String name;
	  int age;

	  //constructor
	  public DeserializationExample(String name, int age)
	  {
	    this.name=name;
	    this.age=age;
	  }

	 
	  public void details()
	  {
	    System.out.println("name of student: "+this.name+"\nage of student: "+this.age);
	  }
	 public static void main(String [] args)
	  {
	    try
	    {
	   
	      FileInputStream f=new FileInputStream("Objects.txt");
	      ObjectInputStream inp=new ObjectInputStream(f);
	      Object o=inp.readObject();   
	      DeserializationExample std=(DeserializationExample)o;     
	      System.out.println("Object state fetched");

	      std.details();
	      inp.close();           
	    }
	    catch(Exception e)
	    {
	      System.out.println("Exception occured");
	    }
	  }
	}