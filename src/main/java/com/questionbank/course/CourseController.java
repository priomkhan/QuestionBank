package com.questionbank.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {

	@Autowired
	private CourseService newService;
	
	@RequestMapping("/course")
	public List<Course> getAllTopics() {
		
		return newService.getAllCourse();
		
	}
	
	
	@RequestMapping("/course/{pid}")
	public Optional<Course> getCourseById(@PathVariable Integer pid) {
		
		return newService.getCourseById(pid);
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/course")
	public void addCourse(@RequestBody Course newData) {
		newService.addCourse(newData);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/course/{pid}")
	public void updateCourse(@RequestBody Course newData, @PathVariable Integer pid) {
		newService.updateCourse(pid,newData);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/course/{pid}")
	public void deleteTopic(@PathVariable Integer id) {
		newService.deleteCourse(id);
	}
}
