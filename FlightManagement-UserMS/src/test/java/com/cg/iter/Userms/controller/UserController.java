package com.cg.iter.Userms.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.iter.Userms.dto.UserDTO;
import com.cg.iter.Userms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/viewAllUsers")
	List<UserDTO> viewAllUsers(){
		return userService.viewAllUsers();
	}
	
	@PostMapping("/addUser")
	String addUser(@RequestBody UserDTO user) {
		String status = "user added";
		
		if(userService.addUser(user)) {
			return status;
		}
		return "fail to add user!";
	}
	
	@PostMapping("/deleteUser")
	String deleteUser(@RequestParam String userId) {
		if(userService.deleteUser(userId)) {
			return "user deleted!";
		}
		return "error";
	}
	@PostMapping("/UpdateUser")
	String updateUser(@RequestBody UserDTO product) {
		String status = "product updated";
		
		if(userService.UpdateUser(product)) {
			return status;
		}
		
		return "fail to update product!";
		
	}
	@PostMapping("/viewUser")
	String viewUser(@RequestParam String userId) {
		if(userService.viewUser(userId)) {
			return "user viewed!";
		}
		return "error";
	}
	
	

}
		
	


}
