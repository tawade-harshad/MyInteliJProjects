<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add Medicine</title>
    <style>
    p{
    color: #ff0000;
    }
    </style>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<body>
<h2>${majorHeading}</h2>
<form:form action="addMedicine" method="post">

    <label>Medicine Code : </label>
    <form:input path="code" />
    <br>
    <label>Medicine Name : </label>
    <form:input path="medicineName"/>
    <br>
    <label>Medicine Type :</label>
    <form:select path="type" items="${medicineTypes}"/>
    <br>
    <label>Cost : </label>
    <form:input path="ratePerUnit"/>
    <br><br>

    <input type="submit" value="ADD">
</form:form>
<p id = "errorMsg">${errorMessage}</p>
<a href="Menu">Back to Menu</a>
</body>
    <script type="text/javascript" src="resources/scripts/addMedicine.js"></script>
</html>
