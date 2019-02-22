package com.capgemini.Resource_Management.model;

import javax.persistence.Entity;

@Entity
public class TrainingDetails extends BaseModel {
	private String training_course_name;
	private String training_code;
	private int training_period;

	public String getTraining_course_name() {
		return training_course_name;
	}

	public void setTraining_course_name(String training_course_name) {
		this.training_course_name = training_course_name;
	}

	public String getTraining_code() {
		return training_code;
	}

	public void setTraining_code(String training_code) {
		this.training_code = training_code;
	}

	public int getTraining_period() {
		return training_period;
	}

	public void setTraining_period(int training_period) {
		this.training_period = training_period;
	}

}
