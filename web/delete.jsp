<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
if(request.getParameter("but4")!=null)
{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Student", "kishor", "0506");
    PreparedStatement ps=conn.prepareStatement("Delete from student where cname=?");
    ps.setString(1,request.getParameter("cname"));
    ps.executeUpdate();
}

%>