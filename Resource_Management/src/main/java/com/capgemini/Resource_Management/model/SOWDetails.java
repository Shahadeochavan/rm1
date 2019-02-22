package com.capgemini.Resource_Management.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class SOWDetails extends BaseModel {

	private String sow_no;
	private String sow_title;
	private String sow_description;
	private Date sow_start_date;
	private Date sow_end_date;

	public String getSow_no() {
		return sow_no;
	}

	public void setSow_no(String sow_no) {
		this.sow_no = sow_no;
	}

	public String getSow_title() {
		return sow_title;
	}

	public void setSow_title(String sow_title) {
		this.sow_title = sow_title;
	}

	public String getSow_description() {
		return sow_description;
	}

	public void setSow_description(String sow_description) {
		this.sow_description = sow_description;
	}

	public Date getSow_start_date() {
		return sow_start_date;
	}

	public void setSow_start_date(Date sow_start_date) {
		this.sow_start_date = sow_start_date;
	}

	public Date getSow_end_date() {
		return sow_end_date;
	}

	public void setSow_end_date(Date sow_end_date) {
		this.sow_end_date = sow_end_date;
	}

}
