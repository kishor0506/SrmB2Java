package Arraylegacy;

public class MyOwnClass {

	String name;
	int age;
	
	

	public MyOwnClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name= " + name + ", Age= " + age + "";
	}
}
