package com.ParkU.classs;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Document(collection="employee_collections")
public class Employee {

	
	//Field annotated with "@Id" or named "id" will be mapped to document _id which is a required field.
	//so here we can add @Id or leave it.
	@Id
	private int id;
	private String name;
	private String age;
	private String gender;
	private String salary;
	
	public Employee(int id,String name,String age, String gender, String salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	
	
	
	/*//instantiate Person with default friends and address
	public Employee(int id,String name){
		this.id = id;
		this.name = name;
		
	}*/
	public Employee(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String toString(){
				
		return "{id: "+this.id+", name: "+this.name+", age: "+this.age+", gender: "+this.gender+", salary: "+this.salary+"}";
	}
}
