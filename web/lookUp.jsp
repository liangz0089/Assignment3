<%-- 
    Document   : lookUp
    Created on : Oct 29, 2018, 2:54:19 PM
    Author     : yunshuliang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student's Phone Number</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    <body>
        <br><br><br><br>
        <h1 style="text-align: center">Student's Phone Number</h1>         
        <br><br>
            <div class="col-md-4">
                <div style="text-align: center">
                 <h2>Search Phone Number</h2>
                 <form method="post" action="Servlet" >
                     <div class="input-group">
                         <div class="input-group-addon">
                            <label>Name： </label>
                         </div>
                         <input type="text" name="search" class="form-control form-group">  
                     </div>
                     <br>
                     <input type="submit" value="Lookup" class="btn btn-primary btn-block">                            
                     </form>                
                 </div>
            </div>
            <div class="col-md-4">
                <div style="text-align: center">
                    <h2>Insert Phone Number</h2>
                    <form method="post" action="Servlet_Insert">
                       <div class="input-group"> 
                           <div class="input-group-addon">
                                <label>Name：</label>
                           </div>                         
                           <input type="text" name="insert_name" class="form-control form-group">                               
                       </div>
                       <br>
                       <div class="input-group"> 
                           <div class="input-group-addon">
                                <label>Phone：</label>
                           </div>
                           <input type="text" name="insert_mobile" class="form-control form-group">                               
                       </div>
                        <br>
                       <input type="submit" value="Insert" class="btn btn-success btn-block">        
                    </form>
                </div>
            </div>
            <div class="col-md-4">
                <div style="text-align: center">
                <h2>Delete Record</h2>
                <form method="post" action="Servlet_Delete">
<!--                    <label>Name：</label>
                    <input type="text" name="delete_name" class="form-control form-group">-->
                    <div class="input-group">
                         <div class="input-group-addon">
                            <label>Name： </label>
                         </div>
                         <input type="text" name="delete_name" class="form-control form-group">  
                    </div>
                     <br>
                    <input type="submit" value="Delete" class="btn btn-danger btn-block">        
                </form>
                </div>
            </div>
        </div>
</html>
