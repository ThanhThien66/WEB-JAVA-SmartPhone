package com.dienthoaishop.dto;

public class SearchDonHangObject {

	private String trangThaiDon;
	private String tuNgay;
	private String denNgay;
	private String hoTenKhachHang;
	private String diaChi;
	private String soDienThoai;
	private String tongGiaTri;	
	

	public SearchDonHangObject(String hoTenNguoiNhan) {
		hoTenKhachHang= hoTenNguoiNhan;
		diaChi= "";
		soDienThoai= "";
		tongGiaTri = "" ;	
	}
	public SearchDonHangObject() {
		trangThaiDon = "";
		tuNgay = "";
		denNgay = "";
	}
	public String getTrangThaiDon() {
		return trangThaiDon;
	}

	public void setTrangThaiDon(String trangThaiDon) {
		this.trangThaiDon = trangThaiDon;
	}

	public String getTuNgay() {
		return tuNgay;
	}

	public void setTuNgay(String tuNgay) {
		this.tuNgay = tuNgay;
	}

	public String getDenNgay() {
		return denNgay;
	}

	public void setDenNgay(String denNgay) {
		this.denNgay = denNgay;
	}

	public String getHoTenKhachHang() {
		return hoTenKhachHang;
	}

	public void setHoTenKhachHang(String hoTenKhachHang) {
		this.hoTenKhachHang = hoTenKhachHang;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	

	@Override
	public String toString() {
		return "SearchDonHangObject [trangThaiDon=" + trangThaiDon + ", tuNgay=" + tuNgay + ", denNgay=" + denNgay
				+ ", hoTenKhachHang=" + hoTenKhachHang + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai
				+ ", tongGiaTri=" + tongGiaTri + "]";
	}

	public String getTongGiaTri() {
		return tongGiaTri;
	}

	public void setTongGiaTri(String tongGiaTri) {
		this.tongGiaTri = tongGiaTri;
	}

}
