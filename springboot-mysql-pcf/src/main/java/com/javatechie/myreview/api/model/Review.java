package com.javatechie.myreview.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "MYReview")
public class Review {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int experience;
	private String companyName;
	private String interviewDate;
	private String interviewMode;
	private String jobDescription;
	private String primaryFocus;
	private String appliedFor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewMode() {
		return interviewMode;
	}

	public void setInterviewMode(String interviewMode) {
		this.interviewMode = interviewMode;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getPrimaryFocus() {
		return primaryFocus;
	}

	public void setPrimaryFocus(String primaryFocus) {
		this.primaryFocus = primaryFocus;
	}

	public String getAppliedFor() {
		return appliedFor;
	}

	public void setAppliedFor(String appliedFor) {
		this.appliedFor = appliedFor;
	}

}
