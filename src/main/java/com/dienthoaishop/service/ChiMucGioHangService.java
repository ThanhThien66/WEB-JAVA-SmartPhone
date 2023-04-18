package com.dienthoaishop.service;

import java.util.List;

import com.dienthoaishop.entities.ChiMucGioHang;
import com.dienthoaishop.entities.GioHang;
import com.dienthoaishop.entities.SanPham;

public interface ChiMucGioHangService {

	List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g);

	ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g);

	ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c);

	void deleteChiMucGiohang(ChiMucGioHang c);

	void deleteAllChiMucGiohang(List<ChiMucGioHang> c);

}
