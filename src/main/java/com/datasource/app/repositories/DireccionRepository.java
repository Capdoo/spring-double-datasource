package com.datasource.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasource.app.models.DireccionModel;

public interface DireccionRepository extends JpaRepository<DireccionModel, Long> {

	public List<DireccionModel> findAll();
	
}
