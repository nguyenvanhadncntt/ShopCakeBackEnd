<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Menu</title>
</head>
<body>
<ul>
<li class="home">
        <a href="home">Home</a>
 </li>
 <li><c:choose>
<c:when test="${sessionScope.user==null }"><a href="loadLogin">Sign in</a></c:when>
<c:otherwise>
 <a href="logout">Sign out</a>
</c:otherwise>
</c:choose>
</li>
</ul>

</body>
</html>