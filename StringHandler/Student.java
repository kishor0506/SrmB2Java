package StringHandler;



public class Student{      
 
	 String name;
	 int rollno;
	 int age;
	 
	void info(){
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
	}  
	
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "Ramesh";
		student.rollno = 253;
		student.age = 25;
		

		student.info();
		
	}
}  
	

