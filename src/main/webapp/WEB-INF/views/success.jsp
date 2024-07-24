<%--
  Created by IntelliJ IDEA.
  User: Rutvik Jasani
  Date: 23/07/2024
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Success Registration</title>
</head>
<body>
    <h1>Name : ${student.name}</h1>
    <h1>id : ${student.id}</h1>
    <h1>DOB : ${student.date}</h1>
    <h1>Courses : ${student.courses}</h1>
    <h1>Gender : ${student.gender}</h1>
    <h1>Student type : ${student.type}</h1>
    <hr>
    <h1>Address</h1>
    <h1>Street : ${student.address.street}</h1>
    <h1>City : ${student.address.city}</h1>
</body>
</html>
