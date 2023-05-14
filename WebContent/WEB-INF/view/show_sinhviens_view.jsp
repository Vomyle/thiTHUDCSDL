<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hien danh sach sinh vien</title>
</head>
<body>
	<h2>sinh viên</h2>
	<table border="1" cellspacing="0" cellpadding="5">
		<tr>
			<th>Id</th>
			<th>Ten</th>
			<th>Ngay sinh</th>
			<th>dtb</th>
			<th colspan=2>Action</th>
		</tr>
		<c:forEach items="${sinhviens }" var="sv">
		<tr>
			<td>${sv.id }</td>
			<td>${sv.ten }</td>
			<td>${sv.ngaysinh }</td>
			<td>${sv.dtb }</td>
		
<td><a href="Controller?act=delete&id=${sv.id}" onclick="return confirm('Bạn có chắc chắn muốn xóa?')"><input type='submit' value='Delete'></a></td>			<td><a href="Controller?act=update&id=${sv.id }"><input type='submit' value='Update'></a></td>
		</tr>
		</c:forEach>
	
	</table>
		<a href="./">Home</a>
		<br>
		${mess1 }
</body>
</html>
