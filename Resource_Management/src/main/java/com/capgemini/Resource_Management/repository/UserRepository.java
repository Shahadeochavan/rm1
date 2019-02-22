package com.capgemini.Resource_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.Resource_Management.model.UserRegistration;
@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Long> {
	
	//public UserRegistration  findByUser_id(String userId);
	
	 @Query(value = "Select u from UserRegistration u where u.userid = :userid and u.isActive = true")
	 public UserRegistration getUserByUser_id(@Param("userid") String userId);

}
