package com.questionbank.adminUsers;

import org.springframework.data.repository.CrudRepository;



public interface AdminUsersRepository extends CrudRepository<AdminUsers, Integer> {
	
	public AdminUsers findByUserName(String userName);
	public AdminUsers deleteByUserName(String userName);

}
