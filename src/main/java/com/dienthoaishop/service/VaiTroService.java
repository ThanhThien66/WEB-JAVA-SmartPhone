package com.dienthoaishop.service;

import java.util.List;

import com.dienthoaishop.entities.VaiTro;

public interface VaiTroService {

	VaiTro findByTenVaiTro(String tenVaiTro);

	List<VaiTro> findAllVaiTro();
}
