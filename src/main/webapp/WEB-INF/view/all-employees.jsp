<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<DOCTYPE html>
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
            </tr>
            <c:forEach var="emp" items="${allEmps}">
                <tr>
                    <td>${emp.name}</td>
                    <td>${emp.surname}</td>
                    <td>${emp.department}</td>
                    <td>${emp.salary}</td>
                </tr>
            </c:forEach>
        </table>

        </body>

    </html>