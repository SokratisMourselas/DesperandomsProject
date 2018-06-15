package com.codinghive.examples.jee.dao;

import com.codinghive.examples.jee.model.Student;

import java.util.List;
import javax.ejb.Local;

@Local
public interface StudentDaoLocal {
	
	void login( String loginUsername, String loginPassword);

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(int studentId);

    Student getStudent(int studentId);

    List<Student> getAllStudents();
    
}
