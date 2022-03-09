package com.project.jpa.hibernate.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee")
public class Course {
	public void setId(long id) {
		this.id = id;
	}
	@Id
	
	private long id;
	
	private String name;
	private Long salary;
	private String designation;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Course() {}
	public Course(long id, String name, int age, String designation, long salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.designation=designation;
		this.salary=salary;
		
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + ", age="
				+ age + "]";
	}
	

}
