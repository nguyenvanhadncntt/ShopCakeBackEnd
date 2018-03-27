<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Cake</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/meo.jpeg">
<link  rel="stylesheet" type="text/css" href="<c:url value="/css/pageCRUD.css" />" media="all" >
</head>
<body>
<div class="search">
	<form action="searchCakeAdmin">
		<input type="text" placeholder="Search cake" name="nameCake"/>
		<input type="submit" value="Seach" class="button"/>
	</form>
	<a href="loadInsertCake" class="btn">Insert Cake</a>
</div>
<div><jsp:include page="menu.jsp"></jsp:include></div>

	<table>
		<tr>
			<th>Code Cake</th>
			<th>Name Cake</th>
			<th>Price</th>
			<th>Image</th>
			<th>Details</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach var="cake" items="${listCake}">
			<tr>
				<td>${cake.cCake}</td>
				<td>${cake.nCake}</td>
				<td>${cake.price}</td>
				<td><img src="${pageContext.request.contextPath}/resources/images/${cake.image}" /></td>
				<td>${cake.detail}</td>
				<td><a href="loadEdit?cCake=${cake.cCake}"><img src="${pageContext.request.contextPath}/resources/images/iconEdit.png"/></a></td>
				<td><a href="loadDelete?cCake=${cake.cCake}"><img src="${pageContext.request.contextPath}/resources/images/removeicon.png"/></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>