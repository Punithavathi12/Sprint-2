package com.JobOpenning.pms;
import java.util.Date;

import jakarta.persistence.*;


@Entity
public class JobOpenning {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobId;
	private int companyId;
	private String Tittle;
	private String description;
	private Date postingDate;
	private Date deadLine;
	
	public JobOpenning() {
		super();
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getTittle() {
		return Tittle;
	}

	public void setTittle(String tittle) {
		this.Tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public JobOpenning(int companyId, String tittle, String description, Date postingDate, Date deadLine) {
		super();
		this.companyId = companyId;
		Tittle = tittle;
		this.description = description;
		this.postingDate = postingDate;
		this.deadLine = deadLine;
	}

	
	
	
	
	

}
