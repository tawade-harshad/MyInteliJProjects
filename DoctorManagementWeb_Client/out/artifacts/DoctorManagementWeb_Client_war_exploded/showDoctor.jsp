<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/22/2019
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medicine Details</title>
</head>
<body>
    <button id="btnGetDetails">Get Medicine Details</button>
    <br>
    <label for="medName">Medicine Name :</label> <div id="medName"></div>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
    var btnGetDetails = document.getElementById("btnGetDetails");
    var medName = document.getElementById("medName");
    btnGetDetails.addEventListener('click',function () {

        $.get("http://localhost:8888/DoctorManagement_war_exploded/webapi/medicine",function(resp){
            medName.innerHTML= resp.medicineName;
        });

    });
</script>
</body>
</html>
