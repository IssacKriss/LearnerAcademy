//package com.learner_academy.controller;
//
//
//import java.util.List;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.PATCH;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import com.learner_academy.model.Classes;
//import com.learner_academy.model.Student;
//import com.learner_academy.model.Subject;
//import com.learner_academy.model.Teacher;
//import com.learner_academy.service.Learner_AcademyService;
//import com.learner_academy.service.Impl.Learner_AcademyServiceImpl;
//
//
//@Path("/")
//public class Controller {
//
//	private Learner_AcademyService service = new Learner_AcademyServiceImpl();
//
//	@POST
//	@Path("/Student/create")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student createStudent(Student student) {
//
//		return service.createStudent(student);
//	}
////
////	@GET
////	@Path("/Student/getById")
////	@Consumes(MediaType.APPLICATION_JSON)
////	@Produces(MediaType.APPLICATION_JSON)
////	public Student getStudentById(int studentId) {
////
////		return service.getStudentById(studentId);
////	}
//
//	@GET
//	@Path("/Student/getAll")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Student> getAllStudents() {
//
//		return service.getAllStudents();
//	}
//
//	@PATCH
//	@Path("/Student/update")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Student updateStudent(Student student) {
//
//		return service.updateStudent(student);
//	}
//
////	@DELETE
////	@Path("/Student/remove")
////	@Consumes(MediaType.APPLICATION_JSON)
////	public void removeStudent(int studentId) {
////
////		service.removeStudent(studentId);
////
////	}
//
//	@POST
//	@Path("/Teacher/create")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Teacher createTeacher(Teacher teacher) {
//
//		return service.createTeacher(teacher);
//	}
////
////	public Teacher getTeacherById(int teacherId) {
////
////		return service.getTeacherById(teacherId);
////	}
//
//	@GET
//	@Path("/Teacher/getAll")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Teacher> getAllTeachers() {
//
//		return service.getAllTeachers();
//	}
//
//	@PATCH
//	@Path("/Teacher/update")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Teacher updateTeacher(Teacher teacher) {
//
//		return service.updateTeacher(teacher);
//	}
//
////	public void removeTeacher(int teacherId) {
////
////		service.removeTeacher(teacherId);
////
////	}
////
//	@POST
//	@Path("/Classes/create")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Classes createClasses(Classes classes) {
//		return service.createClasses(classes);
//
//	}
////
////	public Classes getClassesById(int classId) {
////
////		return service.getClassesById(classId);
////	}
//
//	@GET
//	@Path("/Classes/getAll")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Classes> getAllClasses() {
//
//		return service.getAllClasses();
//	}
//	@PATCH
//	@Path("/update/Classes")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Classes updateClasses(Classes classes) {
//
//		return service.updateClasses(classes);
//	}
//
////	public void removeClasses(int classId) {
////
////		service.removeClasses(classId);
////
////	}
////
//	@POST
//	@Path("/Subject/create")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Subject createSubject(Subject subject) {
//
//		return service.createSubject(subject);
//	}
//
////	public Subject getSubjectById(int subjectId) {
////
////		return service.getSubjectById(subjectId);
////	}
//
//	@GET
//	@Path("/Subject/getAll")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Subject> getAllSubject() {
//
//		return service.getAllSubject();
//	}
//
//	@PATCH
//	@Path("/Subject/update")
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Subject updateSubject(Subject subject) {
//
//		return service.updateSubject(subject);
//	}
//
////	public void removeSubject(int subjectId) {
////
////		service.removeSubject(subjectId);
////
////	}
////	
//
//}
