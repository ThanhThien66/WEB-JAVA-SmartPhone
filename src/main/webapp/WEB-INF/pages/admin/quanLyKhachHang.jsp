<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thống Kê Khách Hàng</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<style>
.form-chiTiet input {
	border: 0;
}
</style>
</head>
<body>
	<jsp:include page="template/header.jsp"></jsp:include>
	<jsp:include page="template/sidebar.jsp"></jsp:include>
	<div class="col-md-9 animated bounce">
	<h3 class="page-header form-inline">Thông Tin Khách Hàng</h3>
	<form class="form-inline" id="searchForm" name="searchObject">
		<div class="form-group" style="float: right; margin-right: 20px">
				<input class="form-control" type="text" id="searchByName"
					placeholder="Nhập tên để tìm nhanh"> <span
					class="glyphicon glyphicon-search" aria-hidden="true"
					style="left: -30px; top: 4px"></span>
		</div>
	</form>
		<hr />
		<table class="table table-bordered table-hover customerTable table-dark table-striped"
			style="text-align: center">
			<thead>
				<tr>
					<th>Họ Tên Khách Hàng</th>
					<th>Địa Chỉ</th>
					<th>Số Điện Thoại</th>
					<th>Tổng Tiền Hàng Đã Đặt</th>
				</tr>
			</thead>
			<tbody>
			</tbody>

		</table>

		<ul class="pagination">
		</ul>
	</div>

	<jsp:include page="template/footer.jsp"></jsp:include>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="<c:url value='/js/customerAjax.js'/>"></script>
</body>
</html>