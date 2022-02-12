package com.datasource.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasource.app.models.EmpleadoModel;

public interface EmpleadoRepository extends JpaRepository<EmpleadoModel, Long>{

	
	
}
