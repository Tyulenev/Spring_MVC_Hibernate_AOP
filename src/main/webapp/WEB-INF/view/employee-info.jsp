<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: a.tulenev
  Date: 26.05.2022
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Emp INFO</title>
</head>
<body>
    <form:form action="saveEmployee" modelAttribute="employee">
        <form:hidden path="id"/>

        Name <form:input path ="name"/>
        <br><br>
        Surname <form:input path ="surname"/>
        <br><br>
        Department <form:input path ="department"/>
        <br><br>
        Salary <form:input path ="salary"/>
        <input type="submit" value="OK"/>
    </form:form>



</body>
</html>
