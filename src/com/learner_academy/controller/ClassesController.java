package com.learner_academy.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.learner_academy.model.Classes;
import com.learner_academy.service.ClassesService;
import com.learner_academy.service.Impl.ClassesServiceImpl;

@Path("/")
public class ClassesController {

	private ClassesService service = new ClassesServiceImpl();
	
	@POST
	@Path("/Classes/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Classes createClasses(Classes classes) {
		return service.createClasses(classes);

	}
//
//	public Classes getClassesById(int classId) {
//
//		return service.getClassesById(classId);
//	}

//	@GET
//	@Path("/Classes/getAll")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Classes> getAllClasses() {
//
//		return service.getAllClasses();
//	}
	@PATCH
	@Path("/Classes/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Classes updateClasses(Classes classes) {

		return service.updateClasses(classes);
	}

////	public void removeClasses(int classId) {
////
////		service.removeClasses(classId);
////
////	}
}
