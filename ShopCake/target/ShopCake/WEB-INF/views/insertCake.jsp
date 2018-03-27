<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Cake</title>
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
	<div  class="main">
		<h2>Insert Cake</h2>
		<form method="post" action="insertCake" enctype="multipart/form-data">
		<table style="width:50%">
			<tr>
			<th>
			<label for="cCake">Code Cake</label>
			</th>
			<td>
			<input type="text" id="cCake" name="cCake" placeholder="Code Cake" /><br/>
			</td>
			</tr>
			<tr>
			<th><label for="nCake">Name Cake</label></th>
			<td><input type="text" id="nCake" name="nCake"
						placeholder="Name Cake" />
			<td>
			</tr>
			<tr>
			<th><label for="cCake">Price</label></th>
			<td><input type="text" id="price" name="price" placeholder="Price Cake" /></td>
			</tr>
			<tr>
			<th>
			<label for="file">Image</label></th>
			<td><input type="file" name="file" id="file"/></td>
			</tr>
			<tr>
			<th><label for="detail">Detail</label></th>
			<td><textarea cols="30" rows="5" name="detail" id="detail" placeholder="input Detail....." class="textarea"></textarea>	</td>		
			</tr>
			<tr>
			<td class="">
			<input type="submit" value="Insert" class="button"/></td></tr>
		</table>
		</form>
	</div>
</body>
</html>