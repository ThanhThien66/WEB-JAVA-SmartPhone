package com.dienthoaishop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dienthoaishop.entities.ChiMucGioHang;
import com.dienthoaishop.entities.GioHang;
import com.dienthoaishop.entities.SanPham;

public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long> {

	ChiMucGioHang findBySanPhamAndGioHang(SanPham sp, GioHang g);

	List<ChiMucGioHang> findByGioHang(GioHang g);
}
