package com.learner_academy.service.Impl;

import java.util.List;

import com.learner_academy.DAO.StudentDAO;
import com.learner_academy.DAO.Impl.StudentDAOImpl;
import com.learner_academy.model.Student;
import com.learner_academy.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao = new StudentDAOImpl();


	public Student createStudent(Student student) {

		return dao.createStudent(student);
	}
	
	public Student getStudentById(int studentId) {

		return dao.getStudentById(studentId);
	}

	public List<Student> getAllStudents() {

		return dao.getAllStudents();
	}

	public Student updateStudent(Student student) {

		return dao.updateStudent(student);
	}

	public void removeStudent(int studentId) {

		dao.removeStudent(studentId);

	}
}
