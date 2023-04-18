package com.dienthoaishop.dto;

public class DonHangDto {

	private String diaChiNhan;
	private String sdtNhanHang;
	private String hoTenNguoiNhan;
	private String tongGiaTri;

	public String getDiaChiNhan() {
		return diaChiNhan;
	}

	public void setDiaChiNhan(String diaChiNhan) {
		this.diaChiNhan = diaChiNhan;
	}

	public String getSdtNhanHang() {
		return sdtNhanHang;
	}

	public void setSdtNhanHang(String sdtNhanHang) {
		this.sdtNhanHang = sdtNhanHang;
	}

	public String getHoTenNguoiNhan() {
		return hoTenNguoiNhan;
	}

	public void setHoTenNguoiNhan(String hoTenNguoiNhan) {
		this.hoTenNguoiNhan = hoTenNguoiNhan;
	}

	@Override
	public String toString() {
		return "DonHangDto [diaChiNhan=" + diaChiNhan + ", sdtNhanHang=" + sdtNhanHang + ", hoTenNguoiNhan="
				+ hoTenNguoiNhan + ", tongGiaTri=" + tongGiaTri + "]";
	}

	public String getTongGiaTri() {
		return tongGiaTri;
	}

	public void setTongGiaTri(String tongGiaTri) {
		this.tongGiaTri = tongGiaTri;
	}

}
