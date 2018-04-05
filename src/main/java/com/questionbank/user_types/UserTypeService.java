package com.questionbank.user_types;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserTypeService {

	@Autowired
	private UserTypeRepository newRepository;
	
	
	public List <UserType> getAllUserType(){		
		List<UserType> newList = new ArrayList<>();
		newRepository.findAll().forEach(newList::add);
		return newList;
	}
	
	public Optional<UserType> getUserTypeById(String pid) {
		
		return newRepository.findById(pid);
		
	}
	
	
	public void addUserType(UserType newData) {	
		
		newRepository.save(newData);
		
		
	}
	
	
	public void updateUserType(String pid, UserType newData) {
		
		newRepository.save(newData);
		
		
		
	}
	
	public void deleteUserType(String pid) {
		
		newRepository.deleteById(pid);
		
	}
	
}
