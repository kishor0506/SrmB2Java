package Exception;

import java.util.Scanner;

public class StudentMain {
	public static void main(String args[])throws OutOfBoundExceptions
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Student No");
        int rollNo = sc.nextInt(); 
        System.out.println("Enter The Student Name");
        String name = sc.next();
        System.out.println("Enter The Marks");
        int marks= sc.nextInt();
        Student s = new Student(rollNo, name, marks);
        
        if(s.ValidateMarks(marks) == true)
        {
        	System.out.println("You Have Passed");
        	System.out.println(s.toString());
        }else
        {
        	System.out.println("You Have Failed");
        	System.out.println(s.toString());
        }
    }
}
