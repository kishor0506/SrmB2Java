package jdbc;

import java.sql.*;
import java.util.Scanner;

public class TransactDb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement ps1=null,ps2=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");  
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "root");  
			ps1=conn.prepareStatement("update bank set balance=balance-? where accno=?");
			ps2=conn.prepareStatement("update bank set balance=balance+? where accno=?");
			Statement st=conn.createStatement(); 
			System.out.println("Table Details: ");
		    System.out.println("*************************");
			ResultSet rs=st.executeQuery("select * from bank");  
		    while(rs.next())
			{
			   System.out.println(rs.getInt(1)+"  "+rs.getInt(2));  
			}
		    System.out.println("\nEnter accno to Withdraw:");
		    int a=sc.nextInt();
		    System.out.println("\nEnter amt:");
		    int b=sc.nextInt();
			ps1.setInt(1,b);
			ps1.setInt(2,a);
			System.out.println("\nEnter accno to deposit:");
		    int a1=sc.nextInt();
		    System.out.println("\nEnter amt:");
		    int b1=sc.nextInt();
			ps2.setInt(1,b1);
			ps2.setInt(2,a1);
			int m1=ps1.executeUpdate();
			int m2=ps2.executeUpdate();
			if(m1>0&&m2>0) 
			{
				System.out.println("\nTransaction Success");
			}
			else 
			{
				System.out.println("\nTransaction failure");
			}
			
			System.out.println("\nUpdated Table Details: ");
		    System.out.println("*************************");
			ResultSet rs1=st.executeQuery("select * from bank");  
		    while(rs1.next())
			{
			   System.out.println(rs1.getInt(1)+"  "+rs1.getInt(2));  
			}
		    conn.close();
	      }
		    catch(ClassNotFoundException e) {
			System.out.println("unable to load Driver");
		    }
	        catch(SQLException e) {
	        	System.out.println("unable to establish connection");
	        }
		
	}

}

