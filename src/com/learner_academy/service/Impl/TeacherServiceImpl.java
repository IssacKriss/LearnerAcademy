package com.learner_academy.service.Impl;

import java.util.List;

import com.learner_academy.DAO.TeacherDAO;
import com.learner_academy.DAO.Impl.TeacherDAOImpl;
import com.learner_academy.model.Teacher;
import com.learner_academy.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

	private TeacherDAO dao = new TeacherDAOImpl();

	@Override
	public Teacher createTeacher(Teacher teacher) {

		return dao.createTeacher(teacher);
	}

	@Override
	public Teacher getTeacherById(int teacherId) {

		return dao.getTeacherById(teacherId);
	}

	@Override
	public List<Teacher> getAllTeachers() {

		return dao.getAllTeachers();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {

		return dao.updateTeacher(teacher);
	}

	@Override
	public void removeTeacher(int teacherId) {

		dao.removeTeacher(teacherId);

	}

}
