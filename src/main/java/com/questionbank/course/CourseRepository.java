package com.questionbank.course;

import org.springframework.data.repository.CrudRepository;



public interface CourseRepository extends CrudRepository<Course, Integer> {
	
//	public List<AcademicLevel> findByName(String Level_Name);


}
