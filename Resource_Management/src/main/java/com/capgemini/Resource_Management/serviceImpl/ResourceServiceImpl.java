package com.capgemini.Resource_Management.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Resource_Management.model.ResourceDetails;
import com.capgemini.Resource_Management.repository.ResourceRepository;
import com.capgemini.Resource_Management.service.ResourceService;

@Service
@Transactional
public class ResourceServiceImpl implements ResourceService {

	@Autowired
	ResourceRepository resourceRepository;

	@Override
	public void saveResource(ResourceDetails resourceDetails) {

		resourceRepository.save(resourceDetails);

	}

	@Override
	public List<ResourceDetails> getListOfResource() {
		// TODO Auto-generated method stub
		return resourceRepository.findAll();
	}

}
