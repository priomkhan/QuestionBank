package com.questionbank.academiclevel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AcademicLevelController {

	@Autowired
	private AcademicLevelService newService;
	
	@RequestMapping("/academicLevel")
	public List<AcademicLevel> getAllTopics() {
		
		return newService.getAllAcademicLevel();
		
	}
	
	
	@RequestMapping("/academicLevel/{id}")
	public Optional<AcademicLevel> getAcademicLevelById(@PathVariable Integer pid) {
		
		return newService.getAcademicLevelById(pid);
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/academicLevel")
	public void addAcademicLevel(@RequestBody AcademicLevel newData) {
		newService.addAcademicLevel(newData);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/academicLevel/{id}")
	public void updateAcademicLevel(@RequestBody AcademicLevel newData, @PathVariable Integer pid) {
		newService.updateAcademicLevel(pid,newData);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/academicLevel/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		newService.deleteAcademicLevel(id);
	}
}
