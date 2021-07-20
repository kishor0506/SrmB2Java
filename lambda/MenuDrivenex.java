package lambda;
import java.util.*;
import java.sql.*;
public class MenuDrivenex 
{
	 public static void main(String args[])
	 {  
		Connection con=null;
	    try
	    {  
		    Class.forName("com.mysql.cj.jdbc.Driver");  
		     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");  
		    
		    Statement stmt=con.createStatement(); 
		    ResultSet rs=null;
		    Scanner s=new Scanner(System.in);
	
			int val=1;
			do{
				System.out.println("-------------------------------------------");
				System.out.println("1. View Table \t2.Insert Record\t3.Delete Record\t4.Update Record\nEnter Your Choice!!!");
			int i=s.nextInt();
		
			switch(i)
			{
			case 1:
				rs=stmt.executeQuery("select * from student");  
			    while(rs.next())  
			    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
				break;
			case 2:
				System.out.println("Enter Register id, name,age");
				int rno1=s.nextInt();
				String name=s.next();
				int age=s.nextInt();
				int result = stmt.executeUpdate("insert into student(Id,Name,Age) values("+rno1+",'"+name+"','"+age+"')");
				if (result > 0)
			        System.out.println("successfully inserted");
				else
			        System.out.println("unsucessful insertion "); 
				break;
		
			case 3:
				System.out.println("Enter Register Number to delete");
				int rno=s.nextInt();
			    stmt.executeUpdate("delete from student where Id="+rno);
				System.out.println("deleted"); 
				break;
			case 4:
				System.out.println("Enter Register Number to Update details");
				int rno2=s.nextInt();
				String name1=s.next();
				int age1=s.nextInt();
				stmt.executeUpdate("update student SET Name='"+name1+"' WHERE Id="+rno2);
				stmt.executeUpdate("update student SET Age='"+age1+"' WHERE Id="+rno2);
				System.out.println("Updated...");
				break;
			case 5:
				val=-1;
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}while (val!=-1);
		
	    }
	    catch(Exception e){ System.out.println(e);
		System.out.println("database not connected");}  
		finally{
		try{con.close(); }
		catch(Exception e){}}
	  } 
 }