package com.dienthoaishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dienthoaishop.entities.GioHang;
import com.dienthoaishop.entities.NguoiDung;

public interface GioHangRepository extends JpaRepository<GioHang, Long> {

	GioHang findByNguoiDung(NguoiDung n);

}
