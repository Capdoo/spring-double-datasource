package com.datasource.app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasource.app.models.PuestoModel;
import com.datasource.app.models.PuestoModel;

public interface PuestoRepository extends JpaRepository<PuestoModel, Long>{

	public Optional<PuestoModel> findById(long id);
	
	public List<PuestoModel> findAll();
	
}
