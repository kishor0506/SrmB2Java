<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<% 
    try
    {
    if (request.getParameter("display") != null) {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Student", "kishor", "0506");
        String url = "select * from Student";

        PreparedStatement ps = conn.prepareStatement(url);
        ResultSet rs = ps.executeQuery();
        %>
        <table border="1">
                 <tr><td>Student Name</td><td>Address</td><td>Zip code</td><td>Phone Number
        </td></tr>
        <%
        while (rs.next()) {
        %>
        <tr>
        <td><% out.println(rs.getString(1));%></td>
        <td><% out.println(rs.getString(2));%></td>
        <td><% out.println(rs.getString(3));%></td>
        <td><% out.println(rs.getString(4));%></td>
       
        </tr>
        </table>
      <%  }
    }
    }
    catch(Exception e)
    {
        out.print(e);
    }
        
 %>