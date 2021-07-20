
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="view.jsp" %>
<%@include file="delete.jsp" %>
<%@include file="update.jsp" %>
<%@include file="insert.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Form</title>
    </head>
    <body >
        <form>
            <fieldset>
                <legend>Student Form</legend>
                
                <table>
                    <tr><td>Student Name</td><td><input type="text" name="cname" /></td></tr>
                    <tr><td>Address</td><td><textarea name="addr"></textarea></td></tr>
                    <tr><td>Zipcode </td><td><input type="text" name="zip" maxlength="6" /></td></tr>
                    <tr><td>Phone Number</td><td><input type="text" name="phone" maxlength="10" /></td></tr>
                    
                    <tr><td><input type="submit" name="but1" value="submit"/></td>
                        <td><input type="submit" name="display" value="Display "></td>
                        <td><input type="submit" name="but2" value="Clear "/></td>
                        <td><input type="submit" name="but3" value="Update "/></td>
                        <td><input type="submit" name="but4" value="Delete "/></td>
                    </tr>       
                </table>
            </fieldset>
        </form>
    </body>
</html>
