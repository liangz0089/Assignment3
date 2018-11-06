<%-- 
    Document   : insert_success
    Created on : Nov 4, 2018, 2:24:14 PM
    Author     : yunshuliang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert_success</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <jsp:useBean id="contact" class="bean.Contact" scope="session" />
    </head>
    <body>
        <h1 class="ftc">
            Insert Sucessfully!
        </h1>
        <h2>
            Insert Name:
            <jsp:getProperty name="contact" property="name" />
        </h2>
        <h2>
            Insert Number:
            <jsp:getProperty name="contact" property="mobile" />
        </h2>
    </body>
</html>