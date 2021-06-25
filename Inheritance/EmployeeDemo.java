package Inheritance;

import java.util.Scanner;

class Employee {
	int empId;
	String empName, addr, mailId;
	long mobileNo;

	public Employee(int empId, String empName, String addr, String mailId, long mobileNo) {
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
		this.mailId = mailId;
		this.mobileNo = mobileNo;
	}

	void display() {
		System.out.println("Employee Id : " + this.empId);
		System.out.println("Employee Name : " + this.empName);
		System.out.println("Employee Address : " + this.addr);
		System.out.println("Employee Mail-Id : " + this.mailId);
		System.out.println("Employee Mobile-No : " + this.mobileNo);
	}
}

class Programmer extends Employee {
	double basicpay, allow, hra, pf, scf, gpay, npay;

	public Programmer(int empId, String empName, String addr, String mailId, long mobileNo, double basicpay) {
		super(empId, empName, addr, mailId, mobileNo);
		this.basicpay = basicpay;
	}

	void displayData() {
		this.allow = this.basicpay * (0.97);
		this.hra = this.basicpay * 0.10;
		this.pf = this.basicpay * 0.12;
		this.scf = this.basicpay * 0.001;
		this.gpay = this.basicpay + this.allow + this.hra + this.pf + this.scf;
		this.npay = this.gpay - this.pf;
		super.display();
		System.out.println("Gross Pay : " + this.gpay);
		System.out.println("Net Pay : " + this.npay);
	}

}

class AssistantProfessor extends Employee {
	double basicpay, allow, hra, pf, scf, gpay, npay;

	public AssistantProfessor(int empId, String empName, String addr, String mailId, long mobileNo, double basicpay) {
		super(empId, empName, addr, mailId, mobileNo);
		this.basicpay = basicpay;
	}

	void displayData() {
		this.allow = this.basicpay * (0.97);
		this.hra = this.basicpay * 0.10;
		this.pf = this.basicpay * 0.12;
		this.scf = this.basicpay * 0.001;
		this.gpay = this.basicpay + this.allow + this.hra + this.pf + this.scf;
		this.npay = this.gpay - this.pf;
		super.display();
		System.out.println("Gross Pay : " + this.gpay);
		System.out.println("Net Pay : " + this.npay);
	}

}

class Professor extends Employee {
	double basicpay, allow, hra, pf, scf, gpay, npay;

	public Professor(int empId, String empName, String addr, String mailId, long mobileNo, double basicpay) {
		super(empId, empName, addr, mailId, mobileNo);
		this.basicpay = basicpay;
	}

	void displayData() {
		this.allow = this.basicpay * (0.97);
		this.hra = this.basicpay * 0.10;
		this.pf = this.basicpay * 0.12;
		this.scf = this.basicpay * 0.001;
		this.gpay = this.basicpay + this.allow + this.hra + this.pf + this.scf;
		this.npay = this.gpay - this.pf;
		super.display();
		System.out.println("Gross Pay : " + this.gpay);
		System.out.println("Net Pay : " + this.npay);
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		int id;
		String empName, addr, mailId,type;
		long mobileNo;
		double bpay;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Type of Employee : ");
		type=sc.next();
		System.out.println("Enter the Employee Id : ");
		id=sc.nextInt();
		System.out.println("Enter the Name : ");
		empName=sc.next();
		System.out.println("Enter the Address : ");
		addr=sc.next();
		System.out.println("Enter the Email-Id : ");
		mailId=sc.next();
		System.out.println("Enter the Mobile-No : ");
		mobileNo=sc.nextLong();
		System.out.println("Enter the Basic Pay : ");
		bpay=sc.nextDouble();
		switch (type) {
		case "programmer":
			Programmer e = new Programmer(id,empName,addr,mailId,mobileNo,bpay);
			e.displayData();
			break;
		case "assistantprofessor":
			AssistantProfessor e1 = new AssistantProfessor(id,empName,addr,mailId,mobileNo,bpay);
			e1.displayData();
			break;
		case "professor":
			Professor e2 = new Professor(id,empName,addr,mailId,mobileNo,bpay);
			e2.displayData();
			break;
		default:
			System.out.println("Invalid Option");
		}

	}

}
