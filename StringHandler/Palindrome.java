package StringHandler;

import java.util.Scanner;

public class Palindrome {

	
		public void palindromeorNot(String a)
		{	
			String b="";
		    int n = a.length();
		        for(int i = n - 1; i >= 0; i--)
		        {
		            b = b + a.charAt(i);
		        }
		        if(a.equalsIgnoreCase(b))
		        {
		            System.out.println("The string is palindrome.");
		        }
		        else
		        {
		            System.out.println("The string is not palindrome.");
		        }
		}
	    public static void main(String args[])
	    {
	        String  val = null ;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter The N number for the String");
	        int n=s.nextInt();
	        for(int i=0;i<n;i++)
	        {
	        	  System.out.print("Enter the string you want to");
	              val= s.next();
	              new Palindrome().palindromeorNot(val);
	        }
	      
	    }
	}

