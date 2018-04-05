package com.questionbank.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.questionbank.academiclevel.AcademicLevel;
import com.questionbank.major.Major;

@Entity
@Table(name = "Course")
public class Course {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer Id;
	  
	  @Column(nullable=false)
	  private String Course_Name;
	  
	  @Column(nullable=false)
	  private Integer Course_ID;
	  
	  @Column(nullable=false)
	  private String Course_Description;
	  
	  @ManyToOne
	  private  Major Major_Id;  //FOREIGN KEY REFERENCES Major(Major_Id),
	  
	  @ManyToOne
	  private  AcademicLevel Level_Id;  //FOREIGN KEY REFERENCES AcademicLevel(Level_Id)
	  
	  public Course() {
		  
	  }

	public Course(Integer id, String course_Name, Integer course_ID, String course_Description, Major major_Id,
			AcademicLevel level_Id) {
		super();
		Id = id;
		Course_Name = course_Name;
		Course_ID = course_ID;
		Course_Description = course_Description;
		Major_Id = major_Id;
		Level_Id = level_Id;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCourse_Name() {
		return Course_Name;
	}

	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	}

	public Integer getCourse_ID() {
		return Course_ID;
	}

	public void setCourse_ID(Integer course_ID) {
		Course_ID = course_ID;
	}

	public String getCourse_Description() {
		return Course_Description;
	}

	public void setCourse_Description(String course_Description) {
		Course_Description = course_Description;
	}

	public Major getMajor_Id() {
		return Major_Id;
	}

	public void setMajor_Id(Major major_Id) {
		Major_Id = major_Id;
	}

	public AcademicLevel getLevel_Id() {
		return Level_Id;
	}

	public void setLevel_Id(AcademicLevel level_Id) {
		Level_Id = level_Id;
	}

	  
	  
	
}
