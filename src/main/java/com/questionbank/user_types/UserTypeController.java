package com.questionbank.user_types;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserTypeController {

	@Autowired
	private UserTypeService newService;
	
	@RequestMapping("/usertype")
	public List<UserType> getAllTopics() {
		
		return newService.getAllUserType();
		
	}
	
	
	@RequestMapping("/usertype/{pid}")
	public Optional<UserType> getUserTypeById(@PathVariable String pid) {
		
		return newService.getUserTypeById(pid);
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/usertype")
	public void addUserType(@RequestBody UserType newData) {
		newService.addUserType(newData);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/usertype/{pid}")
	public void updateUserType(@RequestBody UserType newData, @PathVariable String pid) {
		newService.updateUserType(pid,newData);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/usertype/{pid}")
	public void deleteTopic(@PathVariable String id) {
		newService.deleteUserType(id);
	}
}
