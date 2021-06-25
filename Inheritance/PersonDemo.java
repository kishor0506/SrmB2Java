package Inheritance;

import java.util.Scanner;

class Person
{
	String name,addr;
	long mobileNo;
	double salary;
	int age;
	
	public Person(String name, String addr, long mobileNo, double salary, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.mobileNo = mobileNo;
		this.salary = salary;
		this.age = age;
	}

	void printSalary()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.addr);
		System.out.println("Age : "+this.age);
		System.out.println("Mobile Number : "+this.mobileNo);
		System.out.println("Salary : "+this.salary);
	}
}
class Employ extends Person
{
	String specialization,dept;
	public Employ(String name, String addr, long mobileNo, double salary, int age,String special,String dept) {
		super(name, addr, mobileNo, salary, age);
		this.specialization=special;
		this.dept=dept;
	}
	void printData()
	{
		super.printSalary();
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Department : "+this.dept);
	}
	
	
}
class Manager extends Person
{
	String specialization,dept;
	public Manager(String name, String addr, long mobileNo, double salary, int age,String special,String dept) {
		super(name, addr, mobileNo, salary, age);
		this.specialization=special;
		this.dept=dept;
	}
	void printData()
	{
		super.printSalary();
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Department : "+this.dept);
	}
}
public class PersonDemo {

	public static void main(String[] args) {
		String name,addr;
		long mobileNo;
		double salary;
		int age;
		String specialization,dept;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Option "+"\n1.Enter the Employee Details"+"\n2.Enter the Manager Details");
		int op=sc.nextInt();
		System.out.println("Enter the Name : ");
		name=sc1.nextLine();
		System.out.println("Enter the Address : ");
		addr=sc1.nextLine();
		System.out.println("Enter the Mobile No : ");
		mobileNo=sc.nextLong();
		System.out.println("Enter the Salary : ");
		salary=sc.nextDouble();
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
		System.out.println("Enter the Specialization : ");
		specialization=sc1.nextLine();
		System.out.println("Enter the Department : ");
		dept=sc1.nextLine();
		if(op==1)
		{
			Employ e=new Employ(name, addr, mobileNo, salary, age, specialization, dept);
			e.printData();
		}
		else if(op==2)
		{
			Manager m=new Manager(name, addr, mobileNo, salary, age, specialization, dept);
			m.printData();
		}
		else
		{
			System.out.println("Invalid Option");
		}
		

	}

}
