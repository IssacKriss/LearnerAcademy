package com.learner_academy.service.Impl;

import java.util.List;

import com.learner_academy.DAO.SubjectDAO;
import com.learner_academy.DAO.Impl.SubjectDAOImpl;
import com.learner_academy.model.Subject;
import com.learner_academy.service.SubjectService;

public class SubjectServiceImpl implements SubjectService{

	private SubjectDAO dao = new SubjectDAOImpl();
	
	public Subject createSubject(Subject subject) {

		return dao.createSubject(subject);
	}

	public Subject getSubjectById(int subjectId) {

		return dao.getSubjectById(subjectId);
	}

	public List<Subject> getAllSubject() {

		return dao.getAllSubject();
	}

	public Subject updateSubject(Subject subject) {

		return dao.updateSubject(subject);
	}

	public void removeSubject(int subjectId) {

		dao.removeSubject(subjectId);

	}
	
}
