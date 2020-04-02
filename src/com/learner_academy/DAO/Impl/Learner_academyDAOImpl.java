//package com.learner_academy.DAO.Impl;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//
//import com.learner_academy.DAO.Learner_academyDAO;
//import com.learner_academy.model.Classes;
//import com.learner_academy.model.Student;
//import com.learner_academy.model.Subject;
//import com.learner_academy.model.Teacher;
//
//public class Learner_academyDAOImpl implements Learner_academyDAO{
//
//	Configuration configuration = new Configuration().configure();
//	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//	SessionFactory factory = configuration.buildSessionFactory(builder.build());
//		
//	
//	public Student createStudent(Student student) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(student);
//		transaction.commit();
//		session.close();
//		return student;	
//	}
//
//	
////	public Student getStudentById(int studentId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Student student=(Student)session.get(Student.class, studentId);
////		transaction.commit();
////		session.close();
////		return student;
////	}
//
//
//	public List<Student> getAllStudents() {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		List<Student> studentList=session.createQuery("from com.learner_academy.model.Student").list();
//		transaction.commit();
//		session.close();
//		return studentList;
//	}
//
//	
//	public Student updateStudent(Student student) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.update(student);
//		transaction.commit();
//		session.close();
//		return student;
//	}
//
//	
////	public void removeStudent(int studentId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Student stu= new Student();
////		stu.setStudentId(studentId);
////		session.delete(stu);
////		transaction.commit();
////		session.close();
////				
////	}
//
//	
//	public Teacher createTeacher(Teacher teacher) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(teacher);
//		transaction.commit();
//		session.close();
//		return teacher;
//	}
////
////	
////	public Teacher getTeacherById(int teacherId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Teacher teacher=(Teacher)session.get(Teacher.class, teacherId);
////		transaction.commit();
////		session.close();
////		return teacher;
////	}
//
//	
//	public List<Teacher> getAllTeachers() {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		List<Teacher> teacherList=session.createQuery("from com.learner_academy.model.Teacher").list();
//		transaction.commit();
//		session.close();
//		return teacherList;
//	}
//
//	
//	public Teacher updateTeacher(Teacher teacher) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.update(teacher);
//		transaction.commit();
//		session.close();
//		return teacher;
//	}
//
//	
////	public void removeTeacher(int teacherId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Teacher tea= new Teacher();
////		tea.setTeacherId(teacherId);
////		session.delete(tea);
////		transaction.commit();
////		session.close();
////		
////	}
////
////	
//	public Classes createClasses(Classes classes) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(classes);
//		transaction.commit();
//		session.close();
//		return classes;
//	}
//
//
//	
////	public Classes getClassesById(int classId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Classes classes=(Classes)session.get(Classes.class, classId);
////		transaction.commit();
////		session.close();
////		return classes;
////	}
//
//	
//	public List<Classes> getAllClasses() {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		List<Classes> classesList=session.createQuery("from com.learner_academy.model.Classes").list();
//		transaction.commit();
//		session.close();
//		return classesList;
//	}
//
//	
//	public Classes updateClasses(Classes classes) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.update(classes);
//		transaction.commit();
//		session.close();
//		return classes;
//	}
//
//	
////	public void removeClasses(int classId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Classes cla= new Classes();
////		cla.setClassId(classId);
////		session.delete(cla);
////		transaction.commit();
////		session.close();
////	}
//	
//	
//	public Subject createSubject(Subject subject) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(subject);
//		transaction.commit();
//		session.close();
//		return subject;
//	}
//
//	
////	public Subject getSubjectById(int subjectId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Subject subject=(Subject)session.get(Subject.class, subjectId);
////		transaction.commit();
////		session.close();
////		return subject;
////	}
//
//	
//	public List<Subject> getAllSubject() {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		List<Subject> subjectList=session.createQuery("from com.learner_academy.model.Subject").list();
//		transaction.commit();
//		session.close();
//		return subjectList;
//	}
//
//	
//	public Subject updateSubject(Subject subject) {
//		Session session =factory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.update(subject);
//		transaction.commit();
//		session.close();
//		return subject;
//	}
//
//	
////	public void removeSubject(int subjectId) {
////		Session session =factory.openSession();
////		Transaction transaction = session.beginTransaction();
////		Subject sub= new Subject();
////		sub.setSubjectId(subjectId);
////		session.delete(sub);
////		transaction.commit();
////		session.close();
////		
////	}
//
//
//	
//	
//}
