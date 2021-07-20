package Collection;


public class Employee {
	
	int eno;
	String name;
	String designation;
	public Employee(int eno, String name, String designation) {
		super();
		this.eno = eno;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee Number: " + eno + ", Employee Name: " + name + ", Designation: " + designation ;
	}
}