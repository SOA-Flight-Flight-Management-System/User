package com.cg.iter.Userms.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.cg.iter.Userms.dto.UserDTO;

public interface UserRepository extends CrudRepository<UserDTO, String>{

	void viewById(String userId);

	static Optional<UserDTO> findById(int userId) {
		
		return null;
	}

}

