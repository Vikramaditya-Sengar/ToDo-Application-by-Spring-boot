
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Description</th>
        <th>Target Date</th>
        <th>Option</th>
    </tr>
    <c:forEach var="todo" items="${data}">  
        <tr>
            <td>${todo.id }</td>
            <td>${todo.descp }</td>
            <td>${todo.tdate }</td>
            <td><a href="edittodo?id=${todo.id}">Edit</a>/<a href="deletetodo?sno=${todo.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>