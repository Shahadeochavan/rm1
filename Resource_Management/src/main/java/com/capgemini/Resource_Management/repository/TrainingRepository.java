package com.capgemini.Resource_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Resource_Management.model.TrainingDetails;

@Repository
public interface TrainingRepository extends JpaRepository<TrainingDetails,Long> {

	
	
}
