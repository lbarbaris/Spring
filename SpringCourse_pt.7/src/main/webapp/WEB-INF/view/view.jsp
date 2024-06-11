<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lexa_barbaris
  Date: 11.06.2024
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h3>
    Info for all emps
</h3>
<br><br>
<security:authorize access="hasAnyRole('HR','MANAGER')">
<input type="button" value="Salary" onclick="window.location.href = 'hr_info'">
Only for HR staff
<br><br>
</security:authorize>
<security:authorize access="hasRole('MANAGER')">
<input type="button" value="Performance" onclick="window.location.href = 'manager_info'">
For manager staff
</security:authorize>
</body>
</html>
  