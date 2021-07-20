package Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Empdetails {

	public static void main(String[] args) {
		Employee e= new Employee(1001,"Zem","Senior Dev");
		Employee e1= new Employee(1002,"Aema","Programmer");
		Employee e2= new Employee(1003,"Goliath","Team Lead");
		Employee e3= new Employee(1004,"Annabeth","Trainee");
		
		LinkedList<Employee> llist=new LinkedList<Employee>();
		llist.add(e);
		llist.add(e1);
		llist.add(e2);
		llist.add(e3);
		System.out.println("Employee Details: ");
		for(Employee i:llist)
		{
			System.out.println(i);
		}
		System.out.println("\nFirst Record: "+llist.getFirst());
		System.out.println("\nEmployee Record with Id(1003): "+llist.get(2));
		System.out.println("\nLast Record: "+llist.getLast());
	}

}