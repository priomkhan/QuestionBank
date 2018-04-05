package com.questionbank.major;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MajorController {

	@Autowired
	private MajorService newService;
	
	@RequestMapping("/major")
	public List<Major> getAllTopics() {
		
		return newService.getAllMajor();
		
	}
	
	
	@RequestMapping("/major/{pid}")
	public Optional<Major> getMajorById(@PathVariable Integer pid) {
		
		return newService.getMajorById(pid);
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/major")
	public void addMajor(@RequestBody Major newData) {
		newService.addMajor(newData);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/major/{pid}")
	public void updateMajor(@RequestBody Major newData, @PathVariable Integer pid) {
		newService.updateMajor(pid,newData);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/major/{pid}")
	public void deleteTopic(@PathVariable Integer id) {
		newService.deleteMajor(id);
	}
}
