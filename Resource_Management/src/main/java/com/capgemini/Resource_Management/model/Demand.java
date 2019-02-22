package com.capgemini.Resource_Management.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Demand extends BaseModel {

	private String demand_name;
	private String demand_description;
	private Date dd_start_date;
	private Date dd_end_date;
	private String demand_status;
	private String dd_res_strength;
	private String dd_res_skillset;

	public String getDemand_name() {
		return demand_name;
	}

	public void setDemand_name(String demand_name) {
		this.demand_name = demand_name;
	}

	public String getDemand_description() {
		return demand_description;
	}

	public void setDemand_description(String demand_description) {
		this.demand_description = demand_description;
	}

	public Date getDd_start_date() {
		return dd_start_date;
	}

	public void setDd_start_date(Date dd_start_date) {
		this.dd_start_date = dd_start_date;
	}

	public Date getDd_end_date() {
		return dd_end_date;
	}

	public void setDd_end_date(Date dd_end_date) {
		this.dd_end_date = dd_end_date;
	}

	public String getDemand_status() {
		return demand_status;
	}

	public void setDemand_status(String demand_status) {
		this.demand_status = demand_status;
	}

	public String getDd_res_strength() {
		return dd_res_strength;
	}

	public void setDd_res_strength(String dd_res_strength) {
		this.dd_res_strength = dd_res_strength;
	}

	public String getDd_res_skillset() {
		return dd_res_skillset;
	}

	public void setDd_res_skillset(String dd_res_skillset) {
		this.dd_res_skillset = dd_res_skillset;
	}

}
