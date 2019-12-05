<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/15/2019
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Register User</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<body>
<h2>User Registration Page</h2>
<form:form action="registerUser" method="post" >
    <label>User Name :</label> <form:input path="userName" required="required"/>
    <br><br>
    <label>Password : </label> <form:input path="password" required="required"/>
    <br><br>
    <label>First Name : </label> <form:input path="firstName" required="required"/>
    <br><br>
    <label>Last Name : </label> <form:input path="lastName" required="required"/>
    <br><br>
    <label>Email : </label> <form:input path="email" required="required"/>
    <br><br>
    <label>Address : </label> <form:input path="address" required="required"/>
    <br><br>
    <label>Phone : </label> <form:input path="phone" />
    <br><br>
    <input type="submit" value="Register">
</form:form>
</body>
</html>
