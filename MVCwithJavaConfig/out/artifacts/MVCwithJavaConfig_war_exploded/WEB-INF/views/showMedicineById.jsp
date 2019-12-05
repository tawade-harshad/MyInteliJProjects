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
            color: #ff0000;
        }
    </style>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<body>
<h2>${majorHeading}</h2>
<form action="findById" method="post">
    <label for="code">Medicine Code</label>
    <input type="text" name="code" id="code">
    <br><br>
    <input type="submit" value="SEARCH"></form>
<p id="errorMsg">${errorMessage}</p>
<br><br>
    <a href="Menu">Back to Menu</a>
</body>
    <script type="text/javascript" src="resources/scripts/getMedById.js"></script>
</html>
