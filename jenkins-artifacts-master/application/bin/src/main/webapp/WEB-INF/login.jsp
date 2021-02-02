<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form:form method="post" action="verify" modelAttribute="login">
<table align="center">
<tr>
<td align="right">Internet</td>
<td align="left"> Banking</td>
</tr>
<tr>
<td>UserName or Email</td>
<td><form:input path="userName" /></td>
</tr>
<tr>
<td>PassWord</td>
<td><form:password path="passWord"/></td>
</tr>
<tr>
<td><a href="forgot">Forgot Password</a></td>
<td><a href="newApplication">Sign Up</a></td>
</tr>
<tr>
<td align="right"><form:button>Submit</form:button></td>
</tr>
</table>
</form:form>
</body>
</html>