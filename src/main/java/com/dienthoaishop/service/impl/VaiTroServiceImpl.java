package com.dienthoaishop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dienthoaishop.entities.VaiTro;
import com.dienthoaishop.repository.VaiTroRepository;
import com.dienthoaishop.service.VaiTroService;

@Service
public class VaiTroServiceImpl implements VaiTroService {

	@Autowired
	private VaiTroRepository repo;

	@Override
	public VaiTro findByTenVaiTro(String tenVaiTro) {
		return repo.findByTenVaiTro(tenVaiTro);
	}

	@Override
	public List<VaiTro> findAllVaiTro() {
		return repo.findAll();
	}

}
