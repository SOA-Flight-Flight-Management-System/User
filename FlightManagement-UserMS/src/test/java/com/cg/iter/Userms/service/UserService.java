package com.cg.iter.Userms.service;
import java.util.List;

import com.cg.iter.Userms.dto.UserDTO;
public interface UserService {
	/*
	 * name:
	 * 
	 */
	List<UserDTO> viewAllUsers();
	/*
	 * 
	 */
	boolean addUser(UserDTO user);
	boolean UpdateUser(UserDTO product);
	boolean deleteUser(String userId);
	boolean viewUser(String userId);
}
	
   