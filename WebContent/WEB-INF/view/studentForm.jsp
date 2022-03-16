<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>student registration form</title>
<style>
	.error {
		color:red
	}
</style>
</head>
<body>
<i>Fill out the form. 星號代表必填</i>
<br>
	<form:form action="processForm" modelAttribute="student">
		First name:<form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"></form:errors><br>
		Last name(*):<form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>