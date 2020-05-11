package com.cg.iter.Userms.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.Userms.dto.UserDTO;
import com.cg.iter.Userms.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<UserDTO> viewAllUsers() {
		return (List<UserDTO>) userRepository.findAll();
	}
	@Override
	public boolean addUser(UserDTO user) {
		String UserId = "USR"+userRepository.count();
		user.setUserId(UserId);
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean UpdateUser(UserDTO user) {
		//Option is a data type 
		Optional<UserDTO> find = UserRepository.findById(user.getUserId());
		if(find.isPresent()) {
			userRepository.save(user);
			return true;
		}
		 
		return false;
	}

	@Override
	public boolean deleteUser(String userId) {
		userRepository.deleteById(userId);
		return true;
	}
	@Override
	public boolean viewUser(String userId) {
		userRepository.viewById(userId);
		return true;

}
	
}




