<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}<br>
	<form:form action="dude" method="post" commandName="reg_model">
		<label>Full Name:
			<form:input path="fullname"/>
		</label><br>
		<label>Email:
			<form:input path="email"/>
		</label><br>
		<label>Phone Number:
			<form:input path="phone"/>
		</label><br>
		<label>Address:
			<form:textarea path="address"/>
		</label><br>
		<label>Qualification:
			<form:input path="qualification"/>
		</label><br>
		<label>UserName:
			<form:input path="username"/>
		</label><br>
		<label>Password:
			<form:input path="password"/>
		</label><br>
		<input type="submit" value="Save">
	</form:form>
</body>
</html>