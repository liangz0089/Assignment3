<%-- 
    Document   : delete_success
    Created on : Nov 4, 2018, 2:55:51 PM
    Author     : yunshuliang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete_success</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    <body>
        <h1 class="ftc">
            Delete Successfully!
        </h1>
        <h2>
            <jsp:getProperty name="contact" property="name" />'s mobile phone number is deleted.
        </h2>
    </body>
</html>
