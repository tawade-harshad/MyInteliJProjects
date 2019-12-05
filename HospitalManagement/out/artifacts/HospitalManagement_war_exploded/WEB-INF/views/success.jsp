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
    <title>Nobel Medicals</title>
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
    </style>
</head>
<body>

    <table>
        <tr>
            <th>Code</th>
            <th>Medicine Name</th>
            <th>Rate per Unit</th>
        </tr>
        <tr>
            <td><c:out value="${addedObject.code}"/> </td>
            <td><c:out value="${addedObject.medicineName}"/> </td>
            <td><c:out value="${addedObject.ratePerUnit}" /> </td>
        </tr>
    </table>

</body>
</html>
