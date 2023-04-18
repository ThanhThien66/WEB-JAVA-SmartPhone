package com.dienthoaishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dienthoaishop.entities.VaiTro;

public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {

	VaiTro findByTenVaiTro(String tenVaiTro);
}
