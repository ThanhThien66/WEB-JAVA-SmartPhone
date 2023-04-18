package com.dienthoaishop.service;

import com.dienthoaishop.entities.GioHang;
import com.dienthoaishop.entities.NguoiDung;

public interface GioHangService {

	GioHang getGioHangByNguoiDung(NguoiDung n);

	GioHang save(GioHang g);
}
