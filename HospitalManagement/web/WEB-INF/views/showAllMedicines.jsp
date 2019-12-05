<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/14/2019
  Time: 12:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medicine Details</title>
    <style>
        table{
            border: 2px solid #0000ff;
            margin-left: auto;
            margin-right: auto;
            background-color: lightgray;
            font-family: SansSerif;
        }
        th,tr,td{
            border: 2px solid #0000ff;
            border-collapse: collapse;
            text-align: center;
            background-color: lightgray;
            font-family: SansSerif;
            color: maroon;
        }
        h1{
            text-align: center;
            font-family: SansSerif;
            color: darkgoldenrod;
        }
    </style>
</head>
<body>
<h1>Medicine Inventory</h1>
<table border="1" cellpadding="2"cellspacing="2">
    <thead>
    <tr>
        <th>Code</th>
        <th>Medicine Name</th>
        <th>Rate Per Unit</th>
    </tr>
    </thead>
        <c:if test="${callFrom.equals('multipleValue')}">
        <tbody>
            <c:forEach items="${showAllMedicine}" var="medicine">
                <tr>
                    <td>${medicine.Code}</td>
                    <td>${medicine.Medicine_Name}</td>
                    <td>${medicine.Rate_Per_Unit}</td>
                </tr>
            </c:forEach>
        </tbody>
        </c:if>
        <c:if test="${callFrom.equals('singleValue')}">
            <tbody>
                <tr>
                    <td>${foundoneRow.code}</td>
                    <td>${foundoneRow.medicineName}</td>
                    <td>${foundoneRow.ratePerUnit}</td>
                </tr>
            </tbody>
        </c:if>
</table>
</body>
</html>
