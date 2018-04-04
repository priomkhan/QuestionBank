package com.questionbank.major;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MajorService {

	@Autowired
	private MajorRepository newRepository;
	
	
	public List <Major> getAllMajor(){		
		List<Major> newList = new ArrayList<>();
		newRepository.findAll().forEach(newList::add);
		return newList;
	}
	
	public Optional<Major> getMajorById(Integer pid) {
		
		return newRepository.findById(pid);
		
	}
	
	
	public void addMajor(Major newData) {	
		
		newRepository.save(newData);
		
		
	}
	
	
	public void updateMajor(Integer pid, Major newData) {
		
		newRepository.save(newData);
		
		
		
	}
	
	public void deleteMajor(Integer pid) {
		
		newRepository.deleteById(pid);
		
	}
	
}
