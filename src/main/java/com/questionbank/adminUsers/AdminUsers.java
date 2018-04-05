package com.questionbank.adminUsers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.questionbank.user_types.UserType;

@Entity
@Table(name = "AdminUsers")
public class AdminUsers {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long Id;
	  @Column(nullable=false)
	  private String First_Name;
	  @Column(nullable=false)
	  private String Last_Name;
	  
	  @Column(nullable=false)
	  private String userName;
	  
	  @Column(nullable=false)
	  private String encrytedPassword;
	  @ManyToOne
	  private  UserType userType;  //FOREIGN KEY REFERENCES Major(Major_Id),
	  
	  public AdminUsers() {
		  
	  }
	  
	  

	public AdminUsers(Long id, String first_Name, String last_Name, String userName, String encrytedPassword,
			UserType userType) {
		super();
		Id = id;
		First_Name = first_Name;
		Last_Name = last_Name;
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
		this.userType = userType;
	}



	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	  
	  

	
}
