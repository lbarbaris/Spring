<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lexa_barbaris
  Date: 02.06.2024
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h2>Info</h2>

<form:form action="save" modelAttribute="employee">
    <form:hidden path="id"/>
    Name <br><form:input path="name"/><br><br>
    Surname <br><form:input path="surname"/><br><br>
    Department <br><form:input path="department"/><br><br>
    Salary <br><form:input path="salary"/><br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
