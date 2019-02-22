package com.capgemini.Resource_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Resource_Management.model.ResourceDetails;

@Repository
public interface ResourceRepository extends JpaRepository<ResourceDetails, Long> {

}
