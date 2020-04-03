package com.learner_academy.service.Impl;

import java.util.List;

import com.learner_academy.DAO.ClassesDAO;
import com.learner_academy.DAO.Impl.ClassesDAOImpl;
import com.learner_academy.model.Classes;
import com.learner_academy.service.ClassesService;

public class ClassesServiceImpl implements ClassesService {


	private ClassesDAO dao = new ClassesDAOImpl();
	
	public Classes createClasses(Classes classes) {

		return dao.createClasses(classes);

	}

	public Classes getClassesById(int classId) {

		return dao.getClassesById(classId);
	}

	public List<Classes> getAllClasses() {

		return dao.getAllClasses();
	}

	public Classes updateClasses(Classes classes) {

		return dao.updateClasses(classes);
	}

	public void removeClasses(int classId) {

		dao.removeClasses(classId);

	}
}
