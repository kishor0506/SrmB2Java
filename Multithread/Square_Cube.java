package Multithread;
import java.util.Random;
import java.util.Scanner;

class Square extends Thread
{
	int n;
	int sq;
	public Square(int n) {
		super();
		this.n = n;
	}

	public void run()
	{
		sq=n*n;
		System.out.println("Square Root of "+n+" : "+sq);
	}	
}
class Cube extends Thread
{
	int n;
	int cubic;
	public Cube(int n) {
		super();
		this.n = n;
	}

	public void run()
	{
		cubic=n*n*n;
		System.out.println("Cube Root of "+n+" : "+cubic);
	}	
}

class RandomNumber extends Thread
{
	int n;
	public RandomNumber(int n) {
		super();
		this.n = n;
	}
	public void run()
	{
		Random random = new Random(); 
		for(int i=0;i<5;i++)
		{
			int randNum = random.nextInt(n);
			System.out.println("\nThe Random Number generated: "+randNum);
			if(randNum%2==0)
			{
			 Square s=new Square(randNum);
			 s.start();
			}
			else if(randNum%2!=0)
			{
			Cube c=new Cube(randNum);
			c.start();
			}
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		 }
	}
}
public class Square_Cube
{
	public static void main(String[] args) 
	{
		System.out.println("Find SQUARE ROOt & CUBE ROOT for Randomly genertaed Number:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter the value: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		RandomNumber rn=new RandomNumber(n);
		rn.start();	
	}
}