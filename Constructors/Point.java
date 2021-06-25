package Constructors;
import java.util.Scanner;
import java.util.logging.Logger;

public class Point {
	static Logger log=Logger.getLogger(Point.class.getName());
	private int x,y;
	
	public Point()
	{
		log.info("Instance created.");
		
	}
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void setx(int x)
	{
		this.x=x;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void distance(Point p1,Point p2)
	{
		int point1=p1.x*p1.y;
		int point2=p2.x*p2.y;
		System.out.println("Point P1 : "+point1);
		System.out.println("Point P2 : "+point2);
		System.out.print("Distance between P1 and P2 : "+(point2-point1));
	}
	public static void main(String[] args) {
		Point p=new Point();
		Scanner sc=new Scanner(System.in);
		log.info("Enter Point P1: ");
		int p1=sc.nextInt();
		log.info("Enter Point P2: ");
		int p2=sc.nextInt();
		Point P1=new Point(p1,p2);
		Point P2=new Point();
		p.setx(p1);
		p.sety(p2);
		p.setXY(p1, p2);
		p.distance(P1, P2);
	}
}