package com.project.jpa.hibernate.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.jpa.hibernate.project.entity.Course;
import com.project.jpa.hibernate.project.repository.CourseRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		Course course=repository.findById(10001l);
		logger.info("{}", course);
		//repository.deletBy_Id(10001l);
		repository.save(new Course(10005l,"krishna",24,"emp",60000));
		Course course1=repository.findById(10003l);
		logger.info("{}", course1);
		
	}

}
