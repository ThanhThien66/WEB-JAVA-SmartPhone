package com.dienthoaishop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.dienthoaishop.entities.DonHang;
import com.dienthoaishop.entities.NguoiDung;

public interface DonHangRepository extends JpaRepository<DonHang, Long>, QuerydslPredicateExecutor<DonHang> {

	public List<DonHang> findByTrangThaiDonHangAndShipper(String trangThai, NguoiDung shipper);

	@Query(value = "select DATE_FORMAT(dh.ngayNhanHang, '%m') as month, "
			+ " DATE_FORMAT(dh.ngayNhanHang, '%Y') as year, sum(ct.soLuongNhanHang * ct.donGia) as total "
			+ " from DonHang dh, ChiTietDonHang ct"
			+ " where dh.id = ct.donHang.id and dh.trangThaiDonHang ='Hoàn thành'"
			+ " group by DATE_FORMAT(dh.ngayNhanHang, '%Y%m')" + " order by year asc")
	public List<Object> layDonHangTheoThangVaNam();

	public List<DonHang> findByNguoiDat(NguoiDung ng);

	public int countByTrangThaiDonHang(String trangThaiDonHang);

	@Query(value = "select hoTenNguoiNhan, diaChiNhan, sdtNhanHang,sum(tongGiaTri) as tongGiaTri "
			+ " from DonHang"
			+ " group by hoTenNguoiNhan order by tongGiaTri desc")
	public List<DonHang> findAllByhoTenNguoiNhan();
	
	@Query(value = "select hoTenNguoiNhan, diaChiNhan, sdtNhanHang,sum(tongGiaTri) as tongGiaTri "
			+ " from DonHang"
			+ " where hoTenNguoiNhan like (%:hoTenNguoiNhan%)"
			+ " group by hoTenNguoiNhan order by tongGiaTri desc")
	public List<DonHang> findByhoTenNguoiNhan(String hoTenNguoiNhan);

	
}
