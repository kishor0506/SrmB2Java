package Exception;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) throws OutOfBoundExceptions
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Employee No");
        int empNo = sc.nextInt(); 
        System.out.println("Enter The Employee Name");
        String name = sc.next();
        System.out.println("Enter The Basic Pay");
        int bp= sc.nextInt();
        Employee e = new Employee(empNo, name, bp);
        
        if(e.ValidateBpay(bp))
        {
        	System.out.println("You Have Passed the Criteria");
        	System.out.println(e.toString());
        }else
        {
        	System.out.println("You Have not Passed the criteria");
        	System.out.println(e.toString());
        }
	}
}
