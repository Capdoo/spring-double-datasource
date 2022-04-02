package com.datasource.app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasource.app.models.ModalidadModel;

public interface ModalidadRepository extends JpaRepository<ModalidadModel, Long>{

	public Optional<ModalidadModel> findById(long id);
	
	public List<ModalidadModel> findAll();
	
}
