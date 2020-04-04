package com.learner_academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentId", updatable = false, nullable = false)
	private int studentId;
	private String studentName;
	
	//mapping

//	private Classes clas;
//	
//	public Classes getClas() {
//		return clas;
//	}
//
//
//	public void setClas(Classes clas) {
//		this.clas = clas;
//	}


	public Student() {
		
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	

}
