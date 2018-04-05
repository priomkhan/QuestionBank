package com.questionbank.adminUsers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminUsersService {

	@Autowired
	private AdminUsersRepository newRepository;
	
	
	public List <AdminUsers> getAllAdminUsers(){		
		List<AdminUsers> newList = new ArrayList<>();
		newRepository.findAll().forEach(newList::add);
		return newList;
	}
	
	public AdminUsers getAdminUsersById(String userName) {
		
		return newRepository.findByUserName(userName);
		
	}
	
	
	public void addAdminUsers(AdminUsers newData) {	
		
		newRepository.save(newData);
		
		
	}
	
	
	public void updateAdminUsers(String userName, AdminUsers newData) {
		
		newRepository.save(newData);
		
		
		
	}
	
	public void deleteAdminUsers(String userName) {
		
		newRepository.deleteByUserName(userName);
		
	}
	
}
