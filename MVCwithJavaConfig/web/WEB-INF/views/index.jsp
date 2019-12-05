<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Apollo Hospital</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<body>
<h2>${majorHeading}</h2>
<form:form action="login" method="post">
    <label for="lUserName">User Name</label><form:input type="text" id="lUserName" path="userName" /> <br><br>
    <label for="lPassword">Password </label><form:input type="password" id="lPassword" path="password" /> <br><br>
    <label for="lLogin"><input type="submit" value="Login" id="lLogin"></label>
    &nbsp;&nbsp;&nbsp; New User ? <a href="registerUser">Register</a>
</form:form>
<p id="msg">${successMessage}</p>
</body>
<script type="text/javascript" src="resources/scripts/myLogin.js"></script>
</html>
