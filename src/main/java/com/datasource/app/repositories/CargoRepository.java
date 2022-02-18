package com.datasource.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasource.app.models.CargoModel;

public interface CargoRepository extends JpaRepository<CargoModel, Long>{

	public Optional<CargoModel> findById(long id);
	
}
