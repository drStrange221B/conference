<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: rojayamaharjan
  Date: 1/12/22
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration</h1>

<form:form modelAttribute="registration">
    <table>
    <tr>
        <td>
            name:
        </td>
        <td>
            <form:input path="name"></form:input>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Registration"/>
        </td>
    </tr>
    </table>
</form:form>
</body>
</html>
