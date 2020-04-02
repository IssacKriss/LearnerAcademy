package com.learner_academy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	
	//mapping
	
//	@ManyToOne
//    @JoinColumn(name = "class_Id")
//	private Classes clas;
//
////	@JsonBackReference
//	public Classes getClas() {
//		return clas;
//	}
//
//	public void setClas(Classes clas) {
//		this.clas = clas;
//	}

	public int getStudentId() {
		
		return studentId;
	}


	public Student(String studentName) {
		super();
		this.studentName = studentName;
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

	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}


}
