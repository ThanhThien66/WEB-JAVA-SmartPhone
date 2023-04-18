$(document).ready(function() {
	ajaxGet(1);

	// do get
	function ajaxGet(page) {
		var hoTenNguoiNhan = $('#hoTenNguoiNhan').val();
		$.ajax({
			type: "GET",
			url: "http://localhost:8080/dienthoaishop/api/thong-tin-khach-hang/customer",
			data: {
				hoTenNguoiNhan: hoTenNguoiNhan
			},
			contentType: "application/json",
			success: function(result) {
				$.each(result, function(i, donHang) {
					var tr = $('<tr>');
					tr.append('<td>' + donHang[0] + '</td>');
					tr.append('<td>' + donHang[1] + '</td>');
					tr.append('<td>' + donHang[2] + '</td>');
					tr.append('<td>' + donHang[3] + '</td>');
					tr.append('</tr>');
					$('.customerTable tbody').append(tr);
				});
			},
			error: function(e) {
				alert("Error: ", e);
				console.log("Error", e);
			}
		});
	};
	// event khi click vào nhấn phím vào ô tìm kiếm đơn hàng theo id
	$(document).on('keyup', '#searchByName', function(event) {
		event.preventDefault();
		var donHangName = $('#searchByName').val();
		console.log(donHangName);
		if (donHangName != '') {
			$('.customerTable tbody tr').remove();
			$('.pagination li').remove();
			var href = "http://localhost:8080/dienthoaishop/api/thong-tin-khach-hang/customer/" + donHangName;
			$.get(href, function(donHang) {
				// tính giá trị đơn hàng
				$.each(donHang, function(i, donHang) {
					var tr = $('<tr>');
					tr.append('<td>' + donHang[0] + '</td>');
					tr.append('<td>' + donHang[1] + '</td>');
					tr.append('<td>' + donHang[2] + '</td>');
					tr.append('<td>' + donHang[3] + '</td>');
					tr.append('</tr>');
					$('.customerTable tbody').append(tr);
				});
				$('td').each(function(i) {
					if ($(this).html() == 'null') {
						$(this).html('');
					}
				});
			});
		} else {
			resetData();
		}
	});
});