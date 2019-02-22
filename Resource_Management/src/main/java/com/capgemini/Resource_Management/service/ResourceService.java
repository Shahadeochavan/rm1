package com.capgemini.Resource_Management.service;

import java.util.List;

import com.capgemini.Resource_Management.model.ResourceDetails;

public interface ResourceService {
	
	public void saveResource(ResourceDetails resourceDetails);
	
	public List<ResourceDetails> getListOfResource();

}
