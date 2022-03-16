<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
First Name:${teacher.firstName}
<br>
Last Name:${teacher.lastName}
<br>
Country:${teacher.country}
<br>
FavoriteFood:${teacher.favoriteFood}
<br>
System:
<ul>
	<c:forEach var="temp" items="${teacher.system}">
	<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>