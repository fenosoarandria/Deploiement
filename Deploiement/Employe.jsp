<%-- 
    Document   : Employe
    Created on : 27 sept. 2023, 11:45:24
    Author     : fenosoa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String emp = (String)request.getAttribute("List");
            out.print(emp);
        %>
    </body>
</html>
