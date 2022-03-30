<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Your First Name is : ${student.firstName} 
<br />
Your Last Name is : ${student.lastName}  
<br />
Your Country is : ${student.country}
<br />
Your Gender is : ${student.gender}
<br />
Your selected Operating Systems :
<ul>
<c:forEach var="temp" items="${student.operatingSystems}" >
<li>${temp}</li>

</c:forEach>
</ul>
</body>
</html>