package com.learner_academy.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ClassesTable")
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;
	private String className;

	// mapping

	@OneToMany(mappedBy = "clas", fetch = FetchType.LAZY)
	private List<Student> stu;

//	@JsonManagedReference
	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	
//	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "classes",fetch = FetchType.LAZY)
//	private List<Subject> subj;
//	
//	@JsonManagedReference
//	public List<Subject> getSubj() {
//		return subj;
//	}
//
//	public void setSubj(List<Subject> subj) {
//		this.subj = subj;
//	}
//	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "classes",fetch = FetchType.LAZY)
//	private List<Teacher> teac;
//	
//	@JsonManagedReference
//	public List<Teacher> getTeac() {
//		return teac;
//	}
//
//	public void setTeac(List<Teacher> teac) {
//		this.teac = teac;
//	}


	public Classes(String className, List<Student> stu) {
		super();
		this.className = className;
		this.stu = stu;
	}

	// getters and setters
	public int getClassId() {
		return classId;
	}

	public Classes(String className) {
		super();
		this.className = className;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Classes() {

	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", stu=" + stu + "]";
	}


	

}
