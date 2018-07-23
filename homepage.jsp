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
	${msg}
	
	<div>
		<form:form method="post" commandName="reg_model" action="reg">
    	
			<label for="username">
				Username	
			<form:input path="username" placeholder="Enter Username"/>
			</label>
			<br>
			<label for="password">
			 Password
			<form:input type="password" path="password" placeholder="Enter Password" />
			</label>
			<br>
			<input id="Button1" type="submit" value="login" />
		</form:form> 
	</div>
</body>
</html>