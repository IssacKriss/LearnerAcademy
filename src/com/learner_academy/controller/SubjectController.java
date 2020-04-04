//package com.learner_academy.controller;
//
//import java.util.List;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.GET;
//import javax.ws.rs.PATCH;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//
//import com.learner_academy.model.Classes;
//import com.learner_academy.service.ClassesService;
//import com.learner_academy.service.SubjectService;
//import com.learner_academy.service.Impl.ClassesServiceImpl;
//
//@Path("/Subject")
//public class SubjectController {
//
//private SubjectService service = new SubjectServiceImpl();
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Subject createSubject(Subject subject) {
//		return service.createSubject(subject);
//
//	}
//
//	@GET
//	@Path("/{subjectId}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Subject getSubjectById(@PathParam("subjectId") int subjectId) {
//
//		return service.getSubjectById(subjectId);
//	}
//
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Subject> getAllSubject() {
//
//		return service.getAllSubject();
//	}
//
//	@PATCH
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Subject updateSubject(Subject subject) {
//
//		return service.updateSubject(subject);
//	}
//
//	@DELETE
//	@Path("/{subjectId}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public void removeSubject(@PathParam("subjectId")int subjectId) {
//
//		service.removeSubject(subjectId);
//
//	}
//	
//}
