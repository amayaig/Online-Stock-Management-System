<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach var="cus" items="${cusDetails}"> //loop(printing the data)
	
	${cus.id}    //internally calling the get method in the customer class
	${cus.name}
	${cus.email}
	${cus.phone}
	${cus.username}
	${cus.pw}
	
    </c:forEach>
</body>
</html>