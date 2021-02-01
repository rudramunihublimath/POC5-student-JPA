package com.io.POC5student.repository;

import com.io.POC5student.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository  //optional
public interface StudentRepo extends CrudRepository<Student, Serializable> {


}
