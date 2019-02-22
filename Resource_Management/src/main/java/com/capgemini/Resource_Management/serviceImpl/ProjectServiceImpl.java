package com.capgemini.Resource_Management.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Resource_Management.model.ProjectDetails;
import com.capgemini.Resource_Management.repository.ProjectRepository;
import com.capgemini.Resource_Management.service.ProjectService;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public void saveProject(ProjectDetails projectDetails) {
		projectRepository.save(projectDetails);
		
	}

}
