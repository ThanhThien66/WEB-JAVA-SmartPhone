package com.dienthoaishop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dienthoaishop.entities.ChiMucGioHang;
import com.dienthoaishop.entities.GioHang;
import com.dienthoaishop.entities.SanPham;
import com.dienthoaishop.repository.ChiMucGioHangRepository;
import com.dienthoaishop.service.ChiMucGioHangService;

@Service
public class ChiMucGioHangServiceImpl implements ChiMucGioHangService {

	@Autowired
	private ChiMucGioHangRepository repo;

	@Override
	public ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g) {
		return repo.findBySanPhamAndGioHang(sp, g);
	}

	@Override
	public ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c) {
		return repo.save(c);
	}

	@Override
	public void deleteChiMucGiohang(ChiMucGioHang c) {
		repo.delete(c);
	}

	@Override
	public List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g) {
		return repo.findByGioHang(g);
	}

	@Override
	public void deleteAllChiMucGiohang(List<ChiMucGioHang> c) {
		repo.deleteAll(c);
	}

}
