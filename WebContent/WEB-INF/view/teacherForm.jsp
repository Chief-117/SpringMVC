<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="teacher">
	First name:<form:input path="firstName" />
		<br>
	Last  name:<form:input path="lastName" />
		<br>
	Country:
	<form:select path="country">
		<form:options items="${countryOption2}"/>
	</form:select>
	<form:radiobutton path="favoriteFood" value="���"/>���
	<form:radiobutton path="favoriteFood" value="mango"/>�~�G
	<form:radiobutton path="favoriteFood" value="peach"/>���e��
	<form:radiobutton path="favoriteFood" value="grape"/>����
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
<%-- 			<form:option value="America" label="America" /> --%>
<%-- 			<form:option value="China" label="China" /> --%>
<%-- 			<form:option value="Japan" label="Japan" /> --%>
<%-- 			<form:option value="Taiwan" label="Taiwan" /> --%>