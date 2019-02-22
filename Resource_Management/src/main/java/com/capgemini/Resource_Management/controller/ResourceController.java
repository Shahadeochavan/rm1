package com.capgemini.Resource_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Resource_Management.model.ResourceDetails;
import com.capgemini.Resource_Management.service.ResourceService;
import com.capgemini.Resource_Management.status.Response;

@RestController
@RequestMapping("/resource")
public class ResourceController {
	
	@Autowired
	ResourceService resourceService;

	@PostMapping("/save")
	public Response saveResource(@RequestBody ResourceDetails resourceDetails) {
		try {
			resourceService.saveResource(resourceDetails);
			return new Response(1, "Resource save Successfully"); 
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return new Response(1, "  Resource save Successfully"); 
	}
	
	
	@GetMapping("/list")
	public Response getList() {
		try {
			List<ResourceDetails> resourceDetails = resourceService.getListOfResource();
			return new Response(1, resourceDetails); 
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return new Response(1, "  Resource list"); 
	}

}
