package com.learner_academy.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learner_academy.model.Student;
import com.learner_academy.service.StudentService;
import com.learner_academy.service.Impl.StudentServiceImpl;

@Path("/")
public class StudentController {

	private StudentService service = new StudentServiceImpl();
	@POST
	@Path("/Student/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student createStudent(Student student) {

		return service.createStudent(student);
	}
//
//	@GET
//	@Path("/Student/getById")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student getStudentById(int studentId) {
//
//		return service.getStudentById(studentId);
//	}

//	@GET
//	@Path("/Student/getAll")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Student> getAllStudents() {
//
//		return service.getAllStudents();
//	}

	@PATCH
	@Path("/Student/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student updateStudent(Student student) {

		return service.updateStudent(student);
	}

//	@DELETE
//	@Path("/Student/remove")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public void removeStudent(int studentId) {
//
//		service.removeStudent(studentId);
//
//	}

	
}
