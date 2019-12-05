<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2019
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
    <h1>Registration Form</h1>
    </hr>
    <form action="register.do" method="post">
        <label>User Name : </label>
        <input type="text" name="username" size="15" required/>
        <br><br>

        <label>Password : </label>
        <input type="password" name="password" size="15" required/>
        <br><br>

        <label>Email Id : </label>
        <input type="email" name="emailId" size="15" required/>
        <br><br>

        <label>Contact : </label>
        <input type="number" name="contact" size="15" required/>
        <br><br>

        <input type="submit" value="Register"/>
    </form>
</body>
</html>
