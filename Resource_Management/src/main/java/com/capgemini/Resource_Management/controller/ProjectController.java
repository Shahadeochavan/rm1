package com.capgemini.Resource_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Resource_Management.model.ProjectDetails;
import com.capgemini.Resource_Management.service.ProjectService;
import com.capgemini.Resource_Management.status.Response;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@PostMapping("/save")
	public Response saveProject(@RequestBody ProjectDetails projectDetails) {
		try {
			projectService.saveProject(projectDetails);
			return new Response(1, "ProjectDetails save Successfully"); 
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return new Response(1, "ProjectDetails save Successfully"); 
	}

}
