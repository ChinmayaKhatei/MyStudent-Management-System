package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementspringMvcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementspringMvcApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args)throws Exception {
		Student std1 = new Student("Chinmaya","khatei","khateichinmaya@gmail.com");
		studentRepository.save(std1);
		Student std2 = new Student("Soumya","khatei","soumya@gmail.com");
		studentRepository.save(std2);
		Student std3 = new Student("Bibhuti","khatei","bibhuti990@org.com");
		studentRepository.save(std3);
		Student std4 = new Student("Baina","khatei","nagnakng@org.in");
		studentRepository.save(std4);
	}
	
	

}
