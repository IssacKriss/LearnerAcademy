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
//
//import com.learner_academy.DAO.SubjectDAO;
//import com.learner_academy.model.Subject;
//
//public class SubjectDAOImpl implements SubjectDAO{
//
//	public Subject createSubject(Subject subject) {
//	Session session =factory.openSession();
//	Transaction transaction = session.beginTransaction();
//	session.save(subject);
//	transaction.commit();
//	session.close();
//	return subject;
//}
//
//
//public Subject getSubjectById(int subjectId) {
//	Session session =factory.openSession();
//	Transaction transaction = session.beginTransaction();
//	Subject subject=(Subject)session.get(Subject.class, subjectId);
//	transaction.commit();
//	session.close();
//	return subject;
//}
//
//
//public List<Subject> getAllSubject() {
//	Session session =factory.openSession();
//	Transaction transaction = session.beginTransaction();
//	List<Subject> subjectList=session.createQuery("from com.learner_academy.model.Subject").list();
//	transaction.commit();
//	session.close();
//	return subjectList;
//}
//
//
//public Subject updateSubject(Subject subject) {
//	Session session =factory.openSession();
//	Transaction transaction = session.beginTransaction();
//	session.update(subject);
//	transaction.commit();
//	session.close();
//	return subject;
//}
//
//
//public void removeSubject(int subjectId) {
//	Session session =factory.openSession();
//	Transaction transaction = session.beginTransaction();
//	Subject sub= new Subject();
//	sub.setSubjectId(subjectId);
//	session.delete(sub);
//	transaction.commit();
//	session.close();
//	
//}
//	
//	
//}
