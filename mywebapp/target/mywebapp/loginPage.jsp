<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/2/2019
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>Login Form</h1>
    </hr>
    <form action="login.do" method="post">
        <label>User Name : </label>
        <input type="text" name="username" size="15" required/>
        <br><br>

        <label>Password : </label>
        <input type="password" name="password" size="15" required/>
        <br><br>

        <input type="submit" value="Login"/>
    </form>
</body>
</html>
