<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error{color : red}
</style>
</head>
<body>

<form:form action="processStudent" modelAttribute="student">
First Name : <form:input path="firstName" />
<br /><br />
Last Name : <form:input path="lastName" />
<form:errors path="lastName" cssClass="error" />

<br/><br/>
Gender : Male <form:radiobutton path="gender" value="Male" /> 
Female <form:radiobutton path="gender" value="Female" />
<br /><br />

Operating Systems : 
Mac : <form:checkbox path="operatingSystems" value="Mac OS" />
Linux : <form:checkbox path="operatingSystems" value="Ubuntu" />
Windows : <form:checkbox path="operatingSystems" value="Microsoft Windows 11" />
<br/><br/>
Country : <form:select path="country" >
<form:options items="${student.hm}" />
<br/><hr/>




</form:select>
<input type="submit" value="Submit" />

</form:form>

</body>
</html>