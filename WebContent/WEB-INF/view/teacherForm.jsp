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
	<br>
	喜歡的食物:
	<form:radiobutton path="favoriteFood" value="西瓜"/>西瓜
	<form:radiobutton path="favoriteFood" value="mango"/>芒果
	<form:radiobutton path="favoriteFood" value="peach"/>水蜜桃
	<form:radiobutton path="favoriteFood" value="grape"/>葡萄
	<br>
	作業系統:
	Windows<form:checkbox path="system" value="Windows"/>
	Linux<form:checkbox path="system" value="Linux"/>
	MS Window<form:checkbox path="system" value="MS Window"/>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
<%-- 			<form:option value="America" label="America" /> --%>
<%-- 			<form:option value="China" label="China" /> --%>
<%-- 			<form:option value="Japan" label="Japan" /> --%>
<%-- 			<form:option value="Taiwan" label="Taiwan" /> --%>