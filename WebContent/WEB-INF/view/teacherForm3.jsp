<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="teacher">
	First name:<form:input path="firstName"/>
		<br>
	Last  name:<form:input path="lastName"/>
		<br>
		
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>