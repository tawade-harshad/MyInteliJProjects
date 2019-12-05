<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Apollo Hospital</title>
    <style>
        table{
            border: 2px solid #0000ff;
            margin-left: auto;
            margin-right: auto;

        }
        th,tr,td{
            border: 2px solid #0000ff;
            border-collapse: collapse;
            text-align: center;
        }
        p{
             color: #ff0000;
         }
    </style>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<body>
<h2>${majorHeading}</h2>
    <table>
        <tr>
            <th>Code</th>
            <th>Medicine Name</th>
            <th>Rate per Unit</th>
            <th>Type</th>
        </tr>
        <tr>
            <td><c:out value="${addedObject.code}"/> </td>
            <td><c:out value="${addedObject.medicineName}"/> </td>
            <td><c:out value="${addedObject.ratePerUnit}" /> </td>
            <td><c:out value="${addedObject.type}" /> </td>
        </tr>
    </table>
<br>
<a href="Menu">Back to Menu</a>
</body>
</html>
