package com.capgemini.Resource_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Resource_Management.model.TrainingDetails;
import com.capgemini.Resource_Management.service.TrainingService;
import com.capgemini.Resource_Management.status.Response;

@RestController
@RequestMapping("/training")
public class TrainingController {
	
	@Autowired
    TrainingService trainingService;
	

	@PostMapping("/save")
	public Response saveTraining(@RequestBody TrainingDetails trainingdetails) {
		try {
			trainingService.saveTraining(trainingdetails);
			return new Response(1, "Training save Successfully"); 
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return new Response(1, "Training save Successfully"); 
	}
	
	
	@GetMapping("/list")
	public Response getListTraining() {
		try {
			List<TrainingDetails> trainingdetails = trainingService.getTrainingDetailsList();
			return new Response(1, trainingdetails); 
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return new Response(1, "Training list"); 
	}

	

}
