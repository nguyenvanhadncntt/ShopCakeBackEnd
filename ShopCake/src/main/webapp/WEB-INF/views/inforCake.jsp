<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Information Cake</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/meo.jpeg">
<link  rel="stylesheet" type="text/css" href="<c:url value="/css/inforCakeStyle.css" />" media="all" />
</head>
<body>
<div><jsp:include page="menu.jsp"></jsp:include></div>
<br>
<br>
<br>
<div class="main">
	<form action="#" method="post">
		<input type="text" placeholder="Search" name="nCake"/>
		<input type="submit" value="Search" class="button"/>
	</form>
</div>

<div class="main">
	<table>
	<tr>
	<td rowspan="4">
	<img src="${pageContext.request.contextPath}/resources/images/${cake.image}" alt="${cake.nCake}" title="${cake.nCake}"/>
	</td>
	</tr>
	<tr><th>Mã bánh:</th><td>${cake.cCake}</td></tr>
	<tr><th>Tên bánh:</th><td>${cake.nCake}</td></tr>
	<tr><th>Giá Tiền:</th><td><span>${cake.price} đ/cái</span></td></tr>
	</table>
</div>
<div class="mota">
<p><strong><span>Mô tả:</span>${cake.detail}</strong></p>
</div>
<div class="buy">
	<input type="button" value="Mua" class="button"/>
</div>
</body>
</html>