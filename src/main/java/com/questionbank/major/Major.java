package com.questionbank.major;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Major")
public class Major {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer Major_Id;
	  private String Major_Name;
	  
	  public Major() {
		  
	  }

	public Major(Integer major_Id, String major_Name) {
		super();
		Major_Id = major_Id;
		Major_Name = major_Name;
	}

	public Integer getMajor_Id() {
		return Major_Id;
	}

	public void setMajor_Id(Integer major_Id) {
		Major_Id = major_Id;
	}

	public String getMajor_Name() {
		return Major_Name;
	}

	public void setMajor_Name(String major_Name) {
		Major_Name = major_Name;
	}

	  
	  
	  
	
}
