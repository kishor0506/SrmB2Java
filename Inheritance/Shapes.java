package Inheritance;

class Shape
{
	void display1()
	{
		System.out.println("Welcome to Shape Class");
	}
}
class Rectangles extends Shape
{
	void display()
	{
		System.out.println("Welcome to Rectangle Class");
	}
}
class Circle extends Shape
{
	void display()
	{
		System.out.println("Welcome to Circle Class");
	}
}
class Squares extends Rectangles
{
	void print()
	{
		System.out.println("Square is Rectangle");
	}
}

public class Shapes {

	public static void main(String[] args) {
		
		Rectangles r=new Squares();
		r.display();
		Circle c=new Circle();
		c.display();
		Shape s=new Circle();
		s.display1();
		Squares s1=new Squares();
		s1.print();
	}

}
