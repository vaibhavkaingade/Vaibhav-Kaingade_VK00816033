package com.project.jpa.hibernate.project.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.jpa.hibernate.project.entity.Course;


@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	
	public Course findById(long id){
		return em.find(Course.class, id);
		
	}
	public Course save(Course course) {
		//insert or update
		if (course.getId()== 0) {
			//insert 
			em.persist(course);
			
		}else {
			//update
			em.merge(course);
		}
		return course;
	}
	public void deletBy_Id(Long id) {
		Course course = findById(id);
		em.remove(course);
		
	}
	
	
		
}
