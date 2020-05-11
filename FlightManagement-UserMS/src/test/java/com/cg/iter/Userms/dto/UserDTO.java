package com.cg.iter.Userms.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name= "User_table")
public class UserDTO {
	@Id
 private String userType;
 private int userId;
 private String userName;
 private String userPassword;
 private int userPhone;
 private String userEmail;
 public UserDTO() {}
 public UserDTO(String userType, int userId, String userName, String userPassword, int userPhone, String userEmail) {
	 super();
	 this.userType=userType;
	 this.userId=userId;
	 this.userName=userType;
	 this.userPassword=userPassword;
	 this.userPhone=userPhone;
	 this.userEmail=userEmail;
 }
 public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

public int getUserPhone() {
	return userPhone;
}

public void setUserPhone(int userPhone) {
	this.userPhone = userPhone;
}

public String getUserEmail() {
	return userEmail;
}

public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}


}

