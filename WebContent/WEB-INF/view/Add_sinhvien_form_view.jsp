<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>them sinh vien</title>
</head>
<body>
	<h2>them sinh vien</h2>
	<form action="AddSinhvien" method="post">
		<table border=0 cellspacing=5>
			<tr>
				<td>Ten:</td>
				<td><input name="f_ten"></td>
			</tr>
			<tr>
				<td>Ngay sinh:</td>
				<td><input name="f_ngaysinh"></td>
			</tr>
			<tr>
				<td>dtb:</td>
				<td><input name="f_dtb"></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Add">
					<h3>
						<a href="./">Home</a>
					</h3></td>
			</tr>
		</table>
		<!-- Bao loi neu them khong thanh cong -->
		${mess }
	</form>
</body>
</html>
