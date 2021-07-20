<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
    String cname = request.getParameter("cname");
    String addr = request.getParameter("addr");
    String zip = request.getParameter("zip");
    String phone = request.getParameter("phone");
   
    if (request.getParameter("but1") != null) {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
       Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Student", "kishor", "0506");
        PreparedStatement ps = conn.prepareStatement("insert into Student values(?,?,?,?)");
        ps.setString(1, cname);
        ps.setString(2, addr);
        ps.setString(3, zip);
        ps.setString(4, phone);
        ps.executeUpdate();
        ps.close();
        conn.close();
%>
<script type="text/javascript">
    alert("submitted Successfully")
</script>
<%
    }
%>
