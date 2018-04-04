package com.questionbank.academiclevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AcademicLevelService {

	@Autowired
	private AcademicLevelRepository academicLevelRepository;
	
	
	public List <AcademicLevel> getAllAcademicLevel(){		
		List<AcademicLevel> newList = new ArrayList<>();
		academicLevelRepository.findAll().forEach(newList::add);
		return newList;
	}
	
	public Optional<AcademicLevel> getAcademicLevelById(Integer pid) {
		
		return academicLevelRepository.findById(pid);
		
	}
	
	
	public void addAcademicLevel(AcademicLevel newData) {	
		
		academicLevelRepository.save(newData);
		
		
	}
	
	
	public void updateAcademicLevel(Integer pid, AcademicLevel newData) {
		
		academicLevelRepository.save(newData);
		
		
		
	}
	
	public void deleteAcademicLevel(Integer pid) {
		
		academicLevelRepository.deleteById(pid);
		
	}
	
}
