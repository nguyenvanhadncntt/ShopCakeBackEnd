<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete cake</title>
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
	<br>
	<br>

	<div class="main">
	<h2>Delete Cake</h2>
		<form:form method="post" action="deleteCake" modelAttribute="cake">
			<table>
			<tr>
				<th><label for="cCake">Code Cake</label></th>
				<td><form:input path="cCake" id="cCake" name="cCake"
						placeholder="Code Cake" readonly="true" /></td>
			</tr>
			<tr>
				<th><label for="nCake">Name Cake</label></th>
				<td><form:input path="nCake" id="nCake" name="nCake"
						placeholder="Name Cake" readonly="true" />
				<td>
			</tr>
			<tr>
				<th><label for="cCake">Price</label></th>
				<td><form:input path="price" id="price" name="price"
						placeholder="Price Cake" readonly="true" /></td>
			</tr>
			<tr>
				<th><label for="file">Image</label></th>
				<td class="img_tb"><img
					src="${pageContext.request.contextPath}/resources/images/${cake.image}" /></td>
			</tr>
			<tr>
				<th><label for="detail">Detail</label></th>
				<td><form:textarea cols="30" rows="5" path="detail"
						name="detail" id="detail" placeholder="input Detail....." class="textarea" readonly="true" /></td>
			</tr>
			<tr>
				<td class=""><input type="submit" value="Delete" class="button" /></td>
			</tr>
			</table>
		</form:form>
	</div>
</body>
</html>