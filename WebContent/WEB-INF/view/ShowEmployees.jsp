<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Employees</title>
        <style>
            td, th {
                border: 1px solid;
            }
        </style>
    </head>
    <body>
        <h2>List Employees</h2>
        <table cellspacing="2">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>year</th>
                <th>email</th>
            </tr>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.year}</td>
                    <td>${employee.email}</td>
                    <td>
                        <input type="button" onclick="location.href='./Controller?act=delete&id=${employee.id}';" value="delete" />
                    </td>
                    <td>
                        <input type="button" onclick="location.href='./Controller?act=edit&id=${employee.id}';" value="edit" />
                    </td>
                </tr>
            </c:forEach>
        </table>
        ${mess == null ? "" : mess}
    </body>
</html>
