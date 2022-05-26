<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
    <html>
        <body>
        <h2>ALL EMPS </h2>
        <br>

        <table>
            <tr>
                <th>name</th>
                <th>surname</th>
                <th>department</th>
                <th>salary</th>
                <th>Operations</th>
            </tr>
            <c:forEach var="emp" items="${allEmps}">

<%--                Создание ссылки--%>
                <c:url var = "updateButton" value = "/updateInfo">
                    <c:param name="empId" value="${emp.id}"/>
                </c:url>

                <c:url var = "deleteButton" value = "/deleteEmployee">
                    <c:param name="empId" value="${emp.id}"/>
                </c:url>
                <tr>
                    <td>${emp.name}</td>
                    <td>${emp.surname}</td>
                    <td>${emp.department}</td>
                    <td>${emp.salary}</td>
                    <td>
                        <input type ="button" value="Update"
                        onClick = "window.location.href = '${updateButton}'">

                        <input type ="button" value="Delete"
                               onClick = "window.location.href = '${deleteButton}'">

                    </td>
                </tr>
            </c:forEach>
        </table>
<br>
 <input type="button" value="Add"
 onclick="window.location.href = 'addNewEmployee'"/>

        </body>

    </html>