<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
if(request.getParameter("but3")!=null)
{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Student", "kishor", "0506");
    PreparedStatement ps=conn.prepareStatement("update Student set addr=?,phone=?,zip=? where cname=?");
    ps.setString(1,request.getParameter("addr"));
    ps.setString(4, request.getParameter("phone"));
    ps.setString(5, request.getParameter("zip"));
    ps.setString(6,request.getParameter("cname"));
    ps.executeUpdate();
}


%>