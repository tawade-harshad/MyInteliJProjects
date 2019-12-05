<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medicine By Code</title>
    <style>
        p{
            color: red;
        }
    </style>
</head>
<body>
<form action="findById" method="post">
    <label for="code">Medicine Code</label>
    <input type="text" name="code" id="code">
    <br><br>
    <input type="submit" value="SEARCH"></form>
<p id="msg">${errorMessage}</p>
</body>
<script src="resources/scripts/myScript.js"></script>
</html>
