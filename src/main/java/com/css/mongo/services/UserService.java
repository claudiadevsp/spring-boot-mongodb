package com.css.mongo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.css.mongo.domain.User;
import com.css.mongo.dto.UserDTO;
import com.css.mongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getMail());
	}
}
