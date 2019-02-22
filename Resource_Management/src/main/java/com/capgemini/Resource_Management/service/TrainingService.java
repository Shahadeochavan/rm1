package com.capgemini.Resource_Management.service;

import java.util.List;

import com.capgemini.Resource_Management.model.TrainingDetails;

public interface TrainingService {
	
	public void saveTraining(TrainingDetails trainingdetails);
	
	public List<TrainingDetails> getTrainingDetailsList();
	

}
