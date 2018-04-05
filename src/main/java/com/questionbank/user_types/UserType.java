package com.questionbank.user_types;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserType")
public class UserType {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private String userType;
	  
	  public UserType() {
		  
	  }

	public UserType(String userType) {
		super();
		this.userType = userType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	  
	  
	
}
