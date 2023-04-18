package com.dienthoaishop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dienthoaishop.entities.GioHang;
import com.dienthoaishop.entities.NguoiDung;
import com.dienthoaishop.repository.GioHangRepository;
import com.dienthoaishop.service.GioHangService;

@Service
public class GioHangServiceImpl implements GioHangService {

	@Autowired
	private GioHangRepository repo;

	@Override
	public GioHang getGioHangByNguoiDung(NguoiDung n) {
		return repo.findByNguoiDung(n);
	}

	@Override
	public GioHang save(GioHang g) {
		return repo.save(g);
	}

}
