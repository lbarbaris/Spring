<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<%--@elvariable id="employee" type=""--%>
<form:form action = "show" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
<%--    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
</form:select>
    <br>
    <br>
    Which car do you want?
<%--    Lada <form:radiobutton path="carBrand" value="Lada"/>
    UAZ <form:radiobutton path="carBrand" value="UAZ"/>
    GAZ <form:radiobutton path="carBrand" value="GAZ"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <br>
    Foreign language(s)
<%--    EN<form:checkbox path="languages" value="English"/>
    RU<form:checkbox path="languages" value="Russian"/>
    FR<form:checkbox path="languages" value="French"/>--%>
    <form:checkboxes path="languages" items="${employee.languagesMap}"/>
    <br>
    <br>
    Phone <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Phone <form:input path="email"/>
    <form:errors path="email"/>
    <input type="submit" value="OK">
</form:form>


</body>
</html>
