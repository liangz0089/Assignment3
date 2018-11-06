<%-- 
    Document   : search_success
    Created on : Nov 2, 2018, 11:32:27 AM
    Author     : yunshuliang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search_success</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <jsp:useBean id="contact" class="bean.Contact" scope="session" />
    </head>
    <body>
        <h1 class="ftc">
            Search Successfully!
        </h1>
        <h2>
            <jsp:getProperty name="contact" property="name" />'s mobile phone number is:
            <jsp:getProperty name="contact" property="mobile" />
        </h2>
    </body>
</html>
