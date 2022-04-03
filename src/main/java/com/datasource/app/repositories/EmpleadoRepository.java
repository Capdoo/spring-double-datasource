package com.datasource.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasource.app.models.EmpleadoModel;

public interface EmpleadoRepository extends JpaRepository<EmpleadoModel, Long>{

	public List<EmpleadoModel> findAll();
	
}
