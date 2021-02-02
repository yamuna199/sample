<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Account</title>
</head>
<body>
<form:form action="add" modelAttribute="application" method="post">
<table align="center">
<tr>
<th>Create an</th>
<th>Account</th>
</tr>
<tr>
<td>First Name:</td>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<td>Last Name:</td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<td>Gender</td>
<td><form:radiobutton path="gender" itemValue="Male"/> Male<form:radiobutton path="gender" itemValue="Female"/>Female</td>
</tr>
<tr>
<td>E-Mail:</td>
<td><form:input path="mail"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:password path="passWord"/></td>
</tr>
<tr>
<td><form:button>Submit</form:button></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</form:form>
</body>
</html>