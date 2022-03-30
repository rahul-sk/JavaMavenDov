<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  .error {color:red}
  
</style>
</head>
<body>
<form:form action="processCustomer" modelAttribute="customer">
First Name : <form:input path="firstName" />
<form:errors path="firstName" cssClass="error" />
<br/><br/>

Last Name : <form:input path="lastName" />
<form:errors path="lastName" cssClass="error" />
<br/><br/>
Age : <form:input path="age" />
<form:errors path="age" cssClass="error" />
<input type="submit" value="Submit" />

</form:form>
</body>
</html>