<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="updatetodo">
<input type="hidden" name="id" value="${data.id}">
To do Description<input type="text" name="descp" value="${data.descp}"><br/>
Target Date<input type="date" name="tdate" value="${data.tdate}"><br/>
<input type="submit" value="submit">
</form>
</body>
</html>