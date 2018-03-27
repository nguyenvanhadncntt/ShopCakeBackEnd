<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5.0 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Đăng Nhập</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/meo.jpeg">
<link  rel="stylesheet" type="text/css" href="<c:url value="/css/pageCRUD.css" />" media="all" >
</head>
<body>
<div><jsp:include page="menu.jsp"></jsp:include></div>
<br>
<br>
<br>
<br>
<br>
<div class="main">
	<h2>Login</h2>
	<form action="checkLogin" method="post">
		<input type="text" placeholder="Your Name" name="username"/><br>
		<input type="password" placeholder="Your Password" name="password"/><br>
		<input type="submit" value="Login" class="button"/>
	</form>
	<p>${msg}</p>
</div>
</body>
</html>