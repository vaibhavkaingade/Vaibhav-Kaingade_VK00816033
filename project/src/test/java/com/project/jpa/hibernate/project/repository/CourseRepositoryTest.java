package com.project.jpa.hibernate.project.repository;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.jpa.hibernate.project.ProjectApplication;
import com.project.jpa.hibernate.project.entity.Course;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=ProjectApplication.class)
class CourseRepositoryTest {

	
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository repository;
	
	@Test
	public void findById_Basic() {
		Course course = repository.findById(10001l);

		assertEquals("JPA in 50 steps", course.getName());
	}

}
