package com.questionbank.academiclevel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AcademicLevel")
public class AcademicLevel {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer Level_Id;
	  private String Level_Name;
	  
	  public AcademicLevel() {
		  
	  }

	public AcademicLevel(Integer level_Id, String level_Name) {
		super();
		Level_Id = level_Id;
		Level_Name = level_Name;
	}

	public Integer getLevel_Id() {
		return Level_Id;
	}

	public void setLevel_Id(Integer level_Id) {
		Level_Id = level_Id;
	}

	public String getLevel_Name() {
		return Level_Name;
	}

	public void setLevel_Name(String level_Name) {
		Level_Name = level_Name;
	}

	  
	  
	  
	
}
