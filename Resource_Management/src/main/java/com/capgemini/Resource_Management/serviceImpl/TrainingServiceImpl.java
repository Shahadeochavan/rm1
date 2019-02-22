package com.capgemini.Resource_Management.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Resource_Management.model.TrainingDetails;
import com.capgemini.Resource_Management.repository.TrainingRepository;
import com.capgemini.Resource_Management.service.TrainingService;


@Service
@Transactional
public class TrainingServiceImpl implements TrainingService {

	@Autowired 
	
	TrainingRepository trainingRepository;
	
	@Override
	public void saveTraining(TrainingDetails trainingdetails) {
		// TODO Auto-generated method stub
		
		trainingRepository.save(trainingdetails);
	}

	@Override
	public List<TrainingDetails> getTrainingDetailsList() {
		// TODO Auto-generated method stub
		return trainingRepository.findAll();
	}

	
	
	
}
