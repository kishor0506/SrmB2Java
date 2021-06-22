package Basic;

import java.util.Scanner;

public class Ncr {
	   
    //Method to calculate the nCr value
    static int nCr(int n, int r)   
    {   
          return fact(n) / (fact(r) * fact(n - r));   
    }   
    //Method to calculate the factorial of the number
    static int fact(int n)   
    {   
          int res = 1;   
          for (int i = 2; i <= n; i++)   
          res = res * i;   
          return res;   
    }   
   public static void main(String[] args)   
   {   
       //Take input from the variables
       //Create instance of the Scanner Class
       Scanner sc = new Scanner(System.in);  
       int n,r;  //Declare variables
       System.out.println("Enter the value of n :");  
       n = sc.nextInt();  //Initialize the variables
       System.out.println("Enter the value of r :");
       r = sc.nextInt();  //Initialize the variables
       if(n>=r)
	   {
	       //Print the nCr value
            System.out.println("Value of "+ n+"C"+r+"= "+nCr(n, r)); 
	   }
		else
		  System.out.println("n value should be greater than or equals to r value");
   }   
}
