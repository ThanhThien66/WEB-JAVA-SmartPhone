package com.dienthoaishop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dienthoaishop.entities.ChiTietDonHang;
import com.dienthoaishop.repository.ChiTietDonHangRepository;
import com.dienthoaishop.service.ChiTietDonHangService;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {

	@Autowired
	private ChiTietDonHangRepository repo;

	@Override
	public List<ChiTietDonHang> save(List<ChiTietDonHang> list) {
		return repo.saveAll(list);
	}
}
