package com.questionbank.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

	@Autowired
	private CourseRepository newRepository;
	
	
	public List <Course> getAllCourse(){		
		List<Course> newList = new ArrayList<>();
		newRepository.findAll().forEach(newList::add);
		return newList;
	}
	
	public Optional<Course> getCourseById(Integer pid) {
		
		return newRepository.findById(pid);
		
	}
	
	
	public void addCourse(Course newData) {	
		
		newRepository.save(newData);
		
		
	}
	
	
	public void updateCourse(Integer pid, Course newData) {
		
		newRepository.save(newData);
		
		
		
	}
	
	public void deleteCourse(Integer pid) {
		
		newRepository.deleteById(pid);
		
	}
	
}
