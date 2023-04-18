package com.dienthoaishop.api.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dienthoaishop.entities.DonHang;
import com.dienthoaishop.service.DonHangService;

@RestController
@RequestMapping("/api/thong-tin-khach-hang")
public class ThongTinKhachHangApi {
	@Autowired
	private DonHangService donHangService;

	@GetMapping("/customer")
	public List<DonHang> getDonHangs(Model model) {
		List<DonHang> customer = donHangService.findByhoTenNguoiNhan();
		model.addAttribute("customers", customer);
		return customer;
	}

	@GetMapping("/customer/{donHangName}")
	public List<DonHang> getDonHangsByName(@PathVariable String donHangName, Model model) {
		List<DonHang> customer = donHangService.findByName(donHangName);
		model.addAttribute("customers", customer);
		return customer;
	}
}
