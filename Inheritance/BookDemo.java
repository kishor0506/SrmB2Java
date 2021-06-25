package Inheritance;



import java.util.Scanner;

class Publication
{
	String title;
	double price;
	public Publication(String title,double price) {
	this.title=title;
	this.price=price;
	}
	void display()
	{
		System.out.println("Title : "+this.title);
		System.out.println("Price : "+this.price);
	}
}
class Book extends Publication
{
	int pageno;
	public Book(String title, double price,int pageno) {
		super(title, price);
		this.pageno=pageno;
	}
	void display()
	{
		super.display();
		System.out.println("Page No : "+this.pageno);
	}
}
class CD extends Publication
{
	String time;
	public CD(String title, double price,String time) {
		super(title, price);
		this.time=time;
	}
	void display()
	{
		super.display();
		System.out.println("Display Time"+this.time);
	}
	
}
public class BookDemo {

	public static void main(String[] args) {
		
		String title;
		double price;
		int pageno;
		String time;
		System.out.println("Enter the Option : "+"\n1.Book"+"\n2.CD");
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.println("Enter the Title : ");
			title=sc.next();
			System.out.println("Enter the Price : ");
			price=sc.nextDouble();
			System.out.println("Enter the PageNo : ");
			pageno=sc.nextInt();
			Book b=new Book(title, price, pageno);
			b.display();
		}
		else if(op==2)
		{
			System.out.println("Enter the Title : ");
			title=sc.next();
			System.out.println("Enter the Price : ");
			price=sc.nextDouble();
			System.out.println("Enter the Display Time : ");
			time=sc.next();
			CD cd=new CD(title, price, time);
			cd.display();
		}
		else
		{
			System.out.println("Invalid Option");
		}

	}

}
