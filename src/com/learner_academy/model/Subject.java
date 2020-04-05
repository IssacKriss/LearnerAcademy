package com.learner_academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subjectId", updatable = false, nullable = false)
	private int subjectId;
	private String subjectName;
	
	
//	@ManyToMany
//	@JoinColumn(name = "teacherId")
//	private List<Teacher> teac;
//
//	public List<Teacher> getTeac() {
//		return teac;
//	}
//	public void setTeac(List<Teacher> teac) {
//		this.teac = teac;
//	}
	
	
	
//	@ManyToMany
//	@JoinColumn(name = "classId")
//	private List<Classes> clas;
//
//	public List<Classes> getClas() {
//		return clas;
//	}
//	public void setClas(List<Classes> clas) {
//		this.clas = clas;
//	}

	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}
	public Subject() {
	
	}
	public Subject(String subjectName) {
		super();
		this.subjectName = subjectName;
	}
	
	
}
