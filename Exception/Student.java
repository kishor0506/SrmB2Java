package Exception;

public class Student {public int rollno;
public String name;
public int mark;
public Student(int rollno, String name, int mark) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.mark = mark;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}

public boolean ValidateMarks(int marks) throws OutOfBoundExceptions
{
	if(marks<=40)
	{
		throw new OutOfBoundExceptions("Fail"); 
	}else
	{
		return true;	
	}
	
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
}


}
