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
//	public Classes createSubject(Subject subject) {
//		return service.createSubject(subject);
//
//	}
//
//	@GET
//	@Path("/{classId}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Classes getClassesById(@PathParam("classId") int classId) {
//
//		return service.getClassesById(classId);
//	}
//
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Classes> getAllClasses() {
//
//		return service.getAllClasses();
//	}
//
//	@PATCH
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Classes updateClasses(Classes classes) {
//
//		return service.updateClasses(classes);
//	}
//
//	@DELETE
//	@Path("/{classId}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public void removeClasses(@PathParam("classId")int classId) {
//
//		service.removeClasses(classId);
//
//	}
//	
//}
