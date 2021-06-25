package Inheritance;

import java.util.Scanner;

class Rectangle
{
	double l,b;
	Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	double rarea()
	{
		return this.l*this.b;
	}
	double rperimeter()
	{
		return 2*this.l*this.b;
	}
	
}
class Square extends Rectangle
{
	double side;
	public Square(double l, double b,double side) {
		super(l, b);
		this.side=side;
	}
	double sarea()
	{
		return this.side*this.side;
		
	}
	double sperimeter()
	{
		return 4*this.side;
	}

	
}
public class ShapesDemo {

	public static void main(String[] args) {
		double l,b,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length : ");
		l=sc.nextDouble();
		System.out.println("Enter the Breadth : ");
		b=sc.nextDouble();
		System.out.println("Enter the Side : ");
		s=sc.nextDouble();
		Square s1=new Square(l, b, s);
		double sarea=s1.sarea();
		System.out.println("Area of Square : "+sarea);
		double sper=s1.sperimeter();
		System.out.println("Perimeter of Square: "+sper);
		Rectangle r=new Square(l, b, s);
		double rarea=r.rarea();
		System.out.println("Area of Rectangle : "+rarea);
		double rper=r.rperimeter();
		System.out.println("Perimeter of Rectangle : "+rper);
		
	}

}
