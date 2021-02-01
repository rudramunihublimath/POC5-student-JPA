package com.io.POC5student;

import com.io.POC5student.entity.Student;
import com.io.POC5student.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Poc5StudentApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =SpringApplication.run(Poc5StudentApplication.class, args);
		StudentRepo studentRepo =applicationContext.getBean(StudentRepo.class);  // calling repo

		Student s = new Student();
		s.setStudentId(104);
		s.setStudentName("Rudra");
		s.setStudentEmail("rh@gmail.com");
		s.setStudentAge(21);

		//studentRepo.save(s);

		/*
		Optional<Student> findbyid=studentRepo.findById(103);
		if(findbyid.isPresent()) {
			System.out.println("Record is .."+findbyid.get());
		}
		 */

		Iterable<Student> findall=studentRepo.findAll();
		findall.forEach(i-> {
			System.out.println(i);
		});

		applicationContext.close();   // close conn

	}

}
